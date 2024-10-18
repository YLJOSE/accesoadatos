package gestionDeJugadores.FileManagment;

import gestionDeJugadores.DTO.Player;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FileManager {
    final static File file = new File("C:/Users/ALUMNO CCC - TARDE/Desktop/AD/csvPlayers.csv");


    public static void readPlayers() {
        String lineRead;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            lineRead = bufferedReader.readLine();
            while (lineRead != null) {
                String[] campos = lineRead.split(String.valueOf(";"));
                System.out.println(Arrays.toString(campos));
                lineRead = bufferedReader.readLine();

            }
            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writePLayers() {
        ArrayList<Player> players = new ArrayList<Player>();
        Player a = new Player("Lol", "Perez", 19, "zsr13212", true);

        String [] insertText = {a.getName(),a.getLastName(),String.valueOf(a.getAge()),a.getdNI(), String.valueOf(Boolean.valueOf(a.getActive()))};

        try {
            FileWriter fW = new FileWriter(file, true);

          for(String ayuda : insertText){
              fW.append(ayuda);

          }
            fW.close();
            // falta terminar
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        writePLayers();
        //readPlayers();

        //System.out.printf("%d ==> %c >> %c\n",65,65,65+32);
    }
}
