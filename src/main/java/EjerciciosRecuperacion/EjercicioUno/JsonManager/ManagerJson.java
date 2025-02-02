package EjerciciosRecuperacion.EjercicioUno.JsonManager;

import EjerciciosRecuperacion.EjercicioUno.Interfaces.Leer;
import EjerciciosRecuperacion.EjercicioUno.Objetos.Empresa;
import EjerciciosRecuperacion.EjercicioUno.Objetos.MandosIntermedios;
import EjerciciosRecuperacion.EjercicioUno.Objetos.Persona;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ManagerJson implements Leer {
    private String ruta;
    private List<Persona> empleados = new ArrayList<>();

    public ManagerJson(String ruta) {
        this.ruta = ruta;
    }


    @Override
    public List<Persona> leer() throws FileNotFoundException {
        Gson gson = new Gson();

        FileReader fileReader = new FileReader(ruta);

        Type tipoLista = new TypeToken<Empresa>() {
        }.getType();

//        empleados = gson.fromJson(fileReader, tipoLista);
//        return empleados;

        Empresa empresa = gson.fromJson(fileReader, tipoLista);


        // Mostrar subordinados
        System.out.println("Subordinados:");
//        for (Persona subordinado : empresa.getSubordinados()) {
//            System.out.println(subordinado.getNombre());
//        }
//
//        // Mostrar mandos intermedios
//        System.out.println("\nMandos Intermedios:");
//        for (MandosIntermedios mando : empresa.getMandosIntermedios()) {
//            System.out.println(mando.getNombre() + " - Comisión: " + mando.getComision());
//        }

        return null;
    }

}