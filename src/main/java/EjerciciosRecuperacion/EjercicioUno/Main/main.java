package EjerciciosRecuperacion.EjercicioUno.Main;

import EjerciciosRecuperacion.EjercicioUno.CRUD.MetodosCRUD;
import EjerciciosRecuperacion.EjercicioUno.Interfaces.Leer;
import EjerciciosRecuperacion.EjercicioUno.JsonManager.ManagerJson;

import java.io.FileNotFoundException;

public class main {
    public static void main(String[] args) {
        Leer json = new ManagerJson("empleados.json");

        try {
            MetodosCRUD metodos = new MetodosCRUD(json);

            metodos.listarEmpleados();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
