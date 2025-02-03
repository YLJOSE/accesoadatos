package ExamenRecuperacionJuanJo.Ejercicio1.GestorJson;

import ExamenRecuperacionJuanJo.Ejercicio1.Interfaces.Leer;
import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.Empresa;
import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.MandoIntermedio;
import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.Persona;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class JsonGestor implements Leer {
    protected String ruta;
    private Empresa empleados;

    public JsonGestor(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public Empresa leer() {
        Gson gson = new Gson();
        try (FileReader fichero = new FileReader(ruta)) {

            Type listType = new TypeToken<Empresa>() {
            }.getType();

            empleados = gson.fromJson(fichero, listType);

            return empleados;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
