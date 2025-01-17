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
    protected String path;
    protected List<Person> objects;

    public JsManager(String path) {
        this.path = path;
    }

    @Override
    public void read() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(path)) {
            // sse crea un objeto type y se le asigna un tipo de lista a convertir en este caso lista de personas y se obtiene el tipo
            Type listType = new TypeToken<List<Person>>() {
            }.getType();
            // Deserializar el JSON a una lista de objetos Person
            // creacion de una lista de objetos persona y con el objeto de gson se llama a fromjson y se le pasa el fichero y el tipo de lista
            List<Person> personList = gson.fromJson(reader, listType);

            objects = personList;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> readProps() {
        return List.of();
    }

    public List<Person> get() {
        read();
        return objects;
    }
}
