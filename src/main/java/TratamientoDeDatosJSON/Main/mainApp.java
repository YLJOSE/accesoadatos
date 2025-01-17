package TratamientoDeDatosJSON.Main;

import TratamientoDeDatosJSON.BBDDManager.BDManager;
import TratamientoDeDatosJSON.Interfaces.Read;
import TratamientoDeDatosJSON.Interfaces.Write;
import TratamientoDeDatosJSON.JsonManager.JsManager;
import TratamientoDeDatosJSON.PropsManager.PropsManagerC;

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
