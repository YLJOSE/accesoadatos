package TratamientoDeDatosCSV.Main;

import TratamientoDeDatosCSV.BBDDManager.BDManager;
import TratamientoDeDatosCSV.CSVManager.ReadCSV;
import TratamientoDeDatosCSV.Interfaces.Read;
import TratamientoDeDatosCSV.Interfaces.Write;
import TratamientoDeDatosCSV.Objects.Coche;
import TratamientoDeDatosCSV.PropsManager.PropertiesManager;

import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Read props = new PropertiesManager();
        List<String> listP = props.read();
        Read csvManager = new ReadCSV(listP.get(3));
        List<Coche> coches = Collections.singletonList((Coche) csvManager.readObjects());

        Write bbddManager = new BDManager(listP, coches);
        bbddManager.write();
        listP.clear();
    }
}
