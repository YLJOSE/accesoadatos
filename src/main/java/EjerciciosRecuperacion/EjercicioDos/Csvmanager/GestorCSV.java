package EjerciciosRecuperacion.EjercicioDos.Csvmanager;

import EjerciciosRecuperacion.EjercicioDos.Interfaces.Escribir;
import EjerciciosRecuperacion.EjercicioUno.Objetos.MandosIntermedios;
import EjerciciosRecuperacion.EjercicioUno.Objetos.Persona;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorCSV implements Escribir {

    private String rutaSub;
    private String rutaInter;
    private List<Persona> personas = new ArrayList<>();

    public GestorCSV(String rutaSub, String rutaInter, List<Persona> personas){
        this.rutaInter = rutaInter;
        this.rutaSub = rutaSub;
        this.personas = personas;
    }


    @Override
    public void escribir() throws IOException {
        System.out.println("fff");
        FileWriter subordinados = new FileWriter(rutaSub);
        for (Persona persona: personas){
            if(persona instanceof MandosIntermedios){
                System.out.println("siii");
                return;
            }
        }

        FileWriter intermedios = new FileWriter(rutaInter);
    }
}
