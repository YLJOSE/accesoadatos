package MongoDBEjercicios;

import com.mongodb.client.*;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

public class mongoDBGestor implements CRUD<usuario> {
    private final MongoCollection<Document> mongoColeccion;

    public mongoDBGestor(String databaseName, String collectionName) {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase(databaseName);
        this.mongoColeccion = database.getCollection(collectionName);
    }

    @Override
    public void insertarUsuario(usuario usuario) {
        Document doc = new Document("name", usuario.getNombre()).append("email", usuario.getEmail());
        mongoColeccion.insertOne(doc);
    }

    @Override
    public usuario filtrarPorNombre(String nombre) {
        Document doc = mongoColeccion.find(new Document("name", nombre)).first();
        if (doc != null) {
            usuario usuario = new usuario(doc.getString("name"), doc.getString("email"));
            System.out.println(usuario.getNombre()); // prueba de filtrar
            return usuario;
        }
        return null;
    }

    @Override
    public List<usuario> obtenerTodosLosDocumentos() {
        List<usuario> usuarios = new ArrayList<>();
        for (Document doc : mongoColeccion.find()) {
            usuario usuario = new usuario(doc.getString("name"), doc.getString("email"));
            usuarios.add(usuario);
        }
        return usuarios;
    }

    @Override
    public void actualizarPorNombre(String nombre, usuario usuario) {
        Document filter = new Document("name", nombre);
        Document update = new Document("$set", new Document("name", usuario.getNombre()).append("email", usuario.getEmail()));
        mongoColeccion.updateOne(filter, update);
    }

    @Override
    public void eliminarPorNombre(String nombre) {
        mongoColeccion.deleteOne(new Document("nombre", nombre));
    }
}
