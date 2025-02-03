package ExamenRecuperacionJuanJo.Ejercicio1.main;

import ExamenRecuperacionJuanJo.Ejercicio1.GestorJson.JsonGestor;
import ExamenRecuperacionJuanJo.Ejercicio1.Interfaces.Leer;
import ExamenRecuperacionJuanJo.Ejercicio2.GestorCsv.GestorCsv2;
import ExamenRecuperacionJuanJo.Ejercicio2.Interfaces.Escribir;

public class Main {
    public static void main(String[] args) {
        Leer json = new JsonGestor("C:\\Users\\ALUMNO CCC - TARDE\\IdeaProjects\\accesoadatos\\src\\main\\java\\ExamenRecuperacionJuanJo\\Ejercicio1\\Ficheros\\ayuda.json");


        Escribir escribirCSV = new GestorCsv2(json.leer());

        escribirCSV.escribir();
    }
}
