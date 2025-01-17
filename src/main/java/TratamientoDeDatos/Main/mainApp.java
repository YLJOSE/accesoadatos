package TratamientoDeDatos.Main;

import TratamientoDeDatos.BBDDManager.BDManager;
import TratamientoDeDatos.Interfaces.Read;
import TratamientoDeDatos.Interfaces.Write;
import TratamientoDeDatos.JsonManager.JsManager;
import TratamientoDeDatos.PropsManager.PropsManagerC;

import java.util.List;

public class mainApp {

    public static void main(String[] args) {
        Read props = new PropsManagerC();
        List<String> listP = props.readProps();
        JsManager jsManager = new JsManager(listP.get(3));
        Write bbddManager = new BDManager(listP, jsManager.get());
        bbddManager.write();
        listP.clear();

    }


}
