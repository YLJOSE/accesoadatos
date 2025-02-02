package Simulacro.reto2.Main;

import Simulacro.reto2.GestorJson.JsonManager;
import Simulacro.reto2.Interfaces.Leer;
import Simulacro.reto2.Objetos.Alumno;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Alumno> alumnos;
        Leer json = new JsonManager("C:\\Users\\ALUMNO CCC - TARDE\\IdeaProjects\\accesoadatos\\src\\main\\java\\Simulacro\\reto2\\Libreria\\DatosEstudiantes.json");
        alumnos = json.leer();

        for (Alumno al : alumnos) {
            System.out.println(al.toString());
            for (int i = 0; i < al.vuelve().length; i++) {
                System.out.println(al.vuelve()[i]);
            }
        }


//        Escribir escribirCsv = new CsvManager("C:\\Users\\ALUMNO CCC - TARDE\\Desktop\\AD\\csvAlumnos.csv", alumnos);
//        escribirCsv.escribir();
    }
}
