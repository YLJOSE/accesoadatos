package gestionDeJugadores.FileManagment;

import java.io.*;
import java.util.Arrays;

public class FileManager {
    final static FileReader file;

    static {
        try {
            file = new FileReader("C:/Users/ALUMNO CCC - TARDE/Desktop/AD/csvPlayers.csv");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readPlayers() {
        String lineRead;
        BufferedReader bufferedReader = new BufferedReader(file);
        try {
            lineRead = bufferedReader.readLine();
            while (lineRead != null) {
                String[] campos = lineRead.split(String.valueOf(" "));
                System.out.println(Arrays.toString(campos));
                lineRead = bufferedReader.readLine();

            }
            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void writePLayers(){

    }

    public static void main(String[] args) {
        readPlayers();
    }
}
