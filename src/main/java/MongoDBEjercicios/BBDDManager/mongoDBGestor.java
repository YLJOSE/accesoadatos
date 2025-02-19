package MongoDBEjercicios.BBDDManager;

import MongoDBEjercicios.GestorBinario.BinaryHelper;
import MongoDBEjercicios.GestorBinario.Credentials;
import MongoDBEjercicios.Interfaces.CRUD;
import MongoDBEjercicios.Objetos.usuario;
import com.mongodb.client.*;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class mongoDBGestor implements CRUD<usuario> {
    private final MongoCollection<Document> mongoColeccion;

    public mongoDBGestor() {
        Credentials credentials = BinaryHelper.readCredentials();
        MongoClient mongoClient = MongoClients.create(credentials.getRuta()); //"mongodb://localhost:27017");

        MongoDatabase database = mongoClient.getDatabase(credentials.getBbddNombre());
        this.mongoColeccion = database.getCollection(credentials.getNombreColeccion());
    }

    @Override
    public void insertarUsuario(usuario usuario) {
        Document doc = new Document("name", usuario.getNombre()).append("email", usuario.getEmail());
        mongoColeccion.insertOne(doc);
    }

    @Override
    public usuario filtrarPorNombre(ObjectId objectId) { //String nombre
        Document doc = mongoColeccion.find(new Document("_id", objectId)).first();
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
    public void actualizarPorNombre(ObjectId objectId, usuario usuario) {  //String nombre
        Document filter = new Document("_id", objectId);
        Document update = new Document("$set", new Document("name", usuario.getNombre()).append("email", usuario.getEmail()));
        mongoColeccion.updateOne(filter, update);
    }

    @Override
    public void eliminarPorNombre(ObjectId objectId) { //String nombre
        mongoColeccion.deleteOne(new Document("_id", objectId));
    }
}
