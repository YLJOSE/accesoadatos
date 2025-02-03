package Simulacro.reto1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FicheroBinario {

    private static void store(BDCredenciales bdCredenciales) {
        File file = new File("credenciales.bin");
        if (!file.exists()) {
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
                outputStream.writeObject(bdCredenciales);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


    }

    private static void read() {
        File file = new File("credenciales.bin");
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            BDCredenciales bd = (BDCredenciales) inputStream.readObject();
            System.out.println(bd.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        List<String> props = new ArrayList<>();
        props.add("http://localhost");
        props.add("root");
        props.add("");
        props.add("3306");
        props.add("myDB");
        BDCredenciales credenciales = new BDCredenciales(props);
        //  store(credenciales);

        read();
    }
}
