package TratamientoDeDatosCSV.CSVManager;

import TratamientoDeDatosCSV.Interfaces.Read;
import TratamientoDeDatosCSV.Objects.Coche;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV implements Read {
    protected String path;
    protected List<Coche> objects = new ArrayList<>();

    public ReadCSV(String path) {
        this.path = path;
    }

    @Override
    public List<String> read() {
        String lineRead;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            lineRead = bufferedReader.readLine();
            while (lineRead != null) {
                String[] lineArray = null;
                lineArray = lineRead.split(";");
                Coche coche = new Coche(Integer.parseInt(lineArray[0]), lineArray[1], lineArray[2], lineArray[3], lineArray[4]);
                System.out.println("----------------------------");
                System.out.println(coche.toString());
                System.out.println("----------------------------");
                lineRead = bufferedReader.readLine();

            }

            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    public List<Coche> getObjects() {
        return objects;
    }
}