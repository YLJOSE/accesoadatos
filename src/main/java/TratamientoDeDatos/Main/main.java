package TratamientoDeDatos.Main;

import TratamientoDeDatos.Objects.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class main {


    public static void main(String[] args) {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader("C:\\Users\\juanc\\IdeaProjects\\accesoadatos\\datos\\ayuda.json")) {
            // sse crea un objeto type y se le asigna un tipo de lista a convertir en este caso lista de personas y se obtiene el tipo
            Type listType = new TypeToken<List<Person>>() {
            }.getType();

            // Deserializar el JSON a una lista de objetos Person
            // creacion de una lista de objetos persona y con el objeto de gson se llama a fromjson y se le pasa el fichero y el tipo de lista
            List<Person> personList = gson.fromJson(reader, listType);

            // se imprime la lista de personas
            for (Person person : personList) {
                System.out.println(person.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
