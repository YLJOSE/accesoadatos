package Examples;

import java.io.*;
import java.util.Scanner;

public class readAndwriteText {

    private static String ruta = "C:\\Users\\juanc\\OneDrive\\Documentos\\pruebas\\presentation.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        readOnly();
        System.out.println("Esto es lo que hay por el momento.....");
        System.out.println("Ingresa un texto a guardar en el mismo txt:");
        String newTxt = sc.nextLine();
        writeText(newTxt);
        readOnly();

    }

    static void readOnly() {
        String lineRead;
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            lineRead = br.readLine();

            while (lineRead != null) {
                System.out.println(lineRead);
                lineRead = br.readLine();
            }
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void writeText(String text) {

        try {
            FileWriter fw = new FileWriter(ruta, true);
            fw.append(" ");
            fw.append(text);
            fw.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
