package TratamientoDeDatosJSON.JsonManager;

import TratamientoDeDatosJSON.Interfaces.Read;
import TratamientoDeDatosJSON.Objects.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class JsManager implements Read {
    protected String ruta;
    protected List<Person> alumnos;

    public JsManager(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public void read() {
        Gson gson = new Gson();
        try (FileReader fichero = new FileReader(ruta)) {

            Type listType = new TypeToken<List<Person>>() {
            }.getType();
            List<Person> list = gson.fromJson(fichero, listType);

            alumnos = list;

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Person> get() {
        return alumnos;
    }

    @Override
    public List<String> readProps() {
        return List.of();
    }
}
