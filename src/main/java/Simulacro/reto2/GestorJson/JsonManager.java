package Simulacro.reto2.GestorJson;

import Simulacro.reto2.Interfaces.Leer;
import Simulacro.reto2.Objetos.Alumno;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class JsonManager implements Leer {
    protected String ruta;
    protected List<Alumno> alumnos;

    public JsonManager(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public List<Alumno> leer() {
        Gson gson = new Gson();
        try (FileReader fichero = new FileReader(ruta)) {

            Type listType = new TypeToken<List<Alumno>>() {
            }.getType();
            List<Alumno> list = gson.fromJson(fichero, listType);

            alumnos = list;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return alumnos;
    }
}
