package gestionDeJugadores.FileManagment;

import gestionDeJugadores.DTO.Player;

import java.io.*;
import java.util.Arrays;


public class FileManager {
    final File file = new File("C:/Users/ALUMNO CCC - TARDE/Desktop/AD/csvPlayers.csv");
    static String[] insertText = new String[6];

    public void readPlayers() {

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
                String[] campos = new String[]{lineRead};
                System.out.println(Arrays.toString(campos));
                lineRead = bufferedReader.readLine();

            }

            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void writePLayers(Player player) {

        insertText[0] = String.valueOf(player.getId());
        insertText[1] = player.getName();
        insertText[2] = player.getLastName();
        insertText[3] = String.valueOf(player.getAge());
        insertText[4] = player.getdNI();
        insertText[5] = String.valueOf(player.getActive());


        try {
            FileWriter fW = new FileWriter(file, true);

            for (String lineString : insertText) {
                fW.append(lineString);
                fW.append(";");

            }
            fW.append("\n");
            fW.close();
            System.out.println("El jugador se agregó correctamente!!");
        } catch (IOException e) {
            System.out.println("EL jugador no se agregó correctamente!!");
            throw new RuntimeException(e);
        }

    }

    public void readOnlyIndex(int index) {

    }


}
