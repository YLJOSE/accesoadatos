package MongoDBEjercicios.Mostrar;

import com.mongodb.client.FindIterable;
import org.bson.Document;

public class Mostrar {

    public void mostrarInformacionDocument(FindIterable<Document> docs) {

        for (Document dc : docs) {
            System.out.println("----------------------------------------");
            System.out.println(dc);
            System.out.println("----------------------------------------");
        }

    }

    public void mostrarInformacionString(String[] data) {
        for (String datos : data) {
            System.out.println(datos);
        }
    }

    public void mostrarInformacionConcat(Long resultado, String text) {
        System.out.println(text + resultado);

    }
}
