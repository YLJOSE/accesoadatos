package MongoDBEjercicios.BBDDManager;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


import java.util.List;

public class BBBDDGestor {
    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    private List<String> props;

    public BBBDDGestor(List<String> props) {
        this.props = props;
        mongoClient = MongoClients.create(props.get(0));
        System.out.println("Coneccion establecida!");
    }

    public MongoCollection<Document> obtenerBasesDeDatos(String nombreTabla) {
        mongoDatabase = mongoClient.getDatabase(props.get(1));
        MongoCollection<Document> collection = mongoDatabase.getCollection(nombreTabla);
        return collection;
//        Document doc = new Document();
//
//        collection.insertOne(doc);
//        desconectar();
    }

    public void desconectar() {
        mongoClient.close();
    }

/**
 * Martes 25 examen acceso a datos
 * Viernes 21 examen sistemas de gestion empresarial
 * revisar url mongo db
 * https://ualmtorres.github.io/howtos/MongoDBJava/
 * **/

}
