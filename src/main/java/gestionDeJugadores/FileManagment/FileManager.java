package gestionDeJugadores.FileManagment;

import gestionDeJugadores.DTO.Player;

import java.io.*;
import java.util.Arrays;


public class FileManager {
    private final File file = new File("C:\\Users\\ALUMNO CCC - TARDE\\Desktop\\AD\\csvPlayers.csv");
    private final File fileIndex = new File("C:\\Users\\ALUMNO CCC - TARDE\\Desktop\\AD\\num.txt");
    private static String[] insertText = new String[6];

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
                String text = "";
                String[] camposD = null;
                camposD = lineRead.split(";");

                Player player = new Player(Integer.parseInt(camposD[0]), camposD[1], camposD[2], Integer.parseInt(camposD[3]), camposD[4], Boolean.parseBoolean(camposD[5]));
                System.out.println("----------------------------");
                System.out.println(player.toString());
                System.out.println("----------------------------");
                lineRead = bufferedReader.readLine();

            }

            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void writePLayers(Player player) throws RuntimeException {

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
                String text = "";
                String[] camposD = new String[6];
                int ayuda = lineRead.length();
                int iter = 0;
                for (int i = 0; i < lineRead.length(); i++) {
                    if (lineRead.charAt(i) == ';') {
                        camposD[iter] = text;
                        iter++;
                        text = "";
                    } else {
                        text += lineRead.charAt(i);
                    }
                    if (i == ayuda - 1) {
                        camposD[iter] = text;
                    }
                }
                Player player = new Player(Integer.parseInt(camposD[0]), camposD[1], camposD[2], Integer.parseInt(camposD[3]), camposD[4], Boolean.parseBoolean(camposD[5]));
                System.out.println("----------------------------");

                if (player.getId() == index) {
                    System.out.println(player.toString());
                }
                System.out.println("----------------------------");
                lineRead = bufferedReader.readLine();

            }

            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public int returnLastIndex() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileIndex));
            int index = 0;
            String lineRead = br.readLine();
            while (lineRead != null) {
                index = lineRead.length();
                lineRead = br.readLine();

            }
            System.out.println(index);
            return index;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeLastIndex(int index) {
        try {
            FileWriter fw = new FileWriter(fileIndex, true);
            fw.append(String.valueOf(index));
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void viewNoActive() {
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
                String text = "";
                int ayuda = lineRead.length();
                String[] camposD = new String[6];

                int iter = 0;
                for (int i = 0; i < lineRead.length(); i++) {
                    if (lineRead.charAt(i) == ';') {
                        camposD[iter] = text;
                        iter++;
                        text = "";
                    } else {
                        text += lineRead.charAt(i);
                    }
                    if (i == ayuda - 1) {
                        camposD[iter] = text;
                    }
                }
                Player player = new Player(Integer.parseInt(camposD[0]), camposD[1], camposD[2], Integer.parseInt(camposD[3]), camposD[4], Boolean.parseBoolean(camposD[5]));
                System.out.println("----------------------------");

                if (!player.getActive()) {
                    System.out.println(player.toString());
                }
                System.out.println("----------------------------");
                lineRead = bufferedReader.readLine();

            }

            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
