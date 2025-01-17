package TratamientoDeDatosCSV.CSVManager;

import TratamientoDeDatosCSV.Interfaces.Read;
import TratamientoDeDatosCSV.Objects.Coche;

import java.util.ArrayList;
import java.util.List;

public class ReadCSV implements Read {
    List<Coche> objects = new ArrayList<>();

    @Override
    public void read() {

    }

    public List<Coche> getObjects() {
        return objects;
    }
}
