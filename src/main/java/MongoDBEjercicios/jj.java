package MongoDBEjercicios;

import MongoDBEjercicios.BBDDManager.BBBDDGestor;
import MongoDBEjercicios.CRUDBBDD.MongoCRUD;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class jj {

    public static void main(String[] args) {

        List<String> data = new ArrayList<>();
        data.add("mongodb://localhost:27017/");
        data.add("local");

        BBBDDGestor gestor = new BBBDDGestor(data);

        MongoCollection<Document> docs = gestor.obtenerBasesDeDatos("nueva-tabla");
        // Operaciones CRUD -Pruebas realizadas = 10/10
        // leer
        MongoCRUD mcrud = new MongoCRUD(docs);
        // mcrud.leerBBDD();
        // escribir
        // mcrud.escribir(new Document("nombre","carlos").append("apellidos","rodriguez").append("edad",20));
        //    borrar con datos ficticios
        //   mcrud.borrar("nombre","ahora");

        // borrar todos los documentos

        //mcrud.borrarTodosLosdocumentos();

        //actualizar

        // mcrud.actualizar("nombre","carlos","nombre","nuevo nombre");

        // filtrar datos

        // mcrud.filtrarDatos("nombre", "nuevo nombre");


    }
}
