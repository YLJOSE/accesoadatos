package EjerciciosRecuperacion.EjercicioDos;

import EjerciciosRecuperacion.EjercicioDos.Csvmanager.GestorCSV;
import EjerciciosRecuperacion.EjercicioDos.Interfaces.Escribir;
import EjerciciosRecuperacion.EjercicioUno.CRUD.MetodosCRUD;
import EjerciciosRecuperacion.EjercicioUno.Interfaces.Leer;
import EjerciciosRecuperacion.EjercicioUno.JsonManager.ManagerJson;

import java.io.FileNotFoundException;
import java.io.IOException;

public class tg {
    public static void main(String[] args) {
        Leer json = new ManagerJson("empleados.json");
        try {
            json.leer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        try {
////            MetodosCRUD metodos = new MetodosCRUD(json);
////
////            metodos.listarEmpleados();
////            Escribir gestor = new GestorCSV("subordinados.csv","intermedios.csv",json.leer());
////gestor.escribir();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
