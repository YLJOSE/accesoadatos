package TratamientoDeDatosCSV.Main;

import TratamientoDeDatosCSV.CSVManager.ReadCSV;
import TratamientoDeDatosCSV.Interfaces.Read;
import TratamientoDeDatosCSV.PropsManager.PropertiesManager;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Read props = new PropertiesManager();
        List<String> listP = props.read();
        System.out.println(listP.get(3));
        Read csvManager = new ReadCSV(listP.get(3));
        csvManager.read();
    }
}
