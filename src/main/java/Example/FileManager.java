package Example;

import java.io.*;

public class FileManager {
    private final String ruta = "C:\\Users\\ALUMNO CCC - TARDE\\Desktop\\AD\\numeros.txt";

    public void writeNumber(String num) {
        try {
            FileWriter fw = new FileWriter(ruta);
            fw.append(num);
            fw.close();
            System.out.println("Número guardado correctamente!!!");
        } catch (IOException e) {
            System.err.println("Falló el metodo!!");
            throw new RuntimeException(e);
        }
    }

    public int readNumber() {
        String lineRead;
        int num;
        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            lineRead = br.readLine();
            while (lineRead != null) {
                num = Integer.parseInt(lineRead);
                return num;
            }
            fr.close();
            br.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}
