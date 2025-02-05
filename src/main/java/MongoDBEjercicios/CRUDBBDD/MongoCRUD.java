package MongoDBEjercicios.CRUDBBDD;

import MongoDBEjercicios.Mostrar.Mostrar;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;


public class MongoCRUD {
    private MongoCollection<Document> collection;
    private FindIterable<Document> todaLaColeccion;
    private Mostrar mostrarDatos = new Mostrar();

    public MongoCRUD(MongoCollection<Document> collection) {
        this.collection = collection;
    }

    public void leerBBDD() {
        todaLaColeccion = collection.find();

        //todaLaColeccion.forEach(System.out::println);
        mostrarDatos.mostrarInformacionDocument(todaLaColeccion);
    }

    public void escribir(Document documento) {
        collection.insertOne(documento);
        mostrarDatos.mostrarInformacionString(new String[]{"Escritura correcta!!"});
    }

    public void borrar(String clave, String valor) {
        // filtro para ver lo que queremos eliminar de ejemplo clave name y valor pedro
        Bson filter = Filters.eq(clave, valor);
        DeleteResult resultadoBorrado = collection.deleteMany(filter);

        mostrarDatos.mostrarInformacionConcat(resultadoBorrado.getDeletedCount(), "Total de datos eliminados: ");
    }

    public void borrarTodosLosdocumentos() {
        DeleteResult resultadoBorrado = collection.deleteMany(Filters.empty());
        mostrarDatos.mostrarInformacionConcat(resultadoBorrado.getDeletedCount(),"Total de datos eliminados: ");
    }

    public void actualizar(String claveF, String valorF, String claveModificada, String valorModificado) {
        // filtro para ver lo que queremos modificar de ejemplo claveF name y valorF pedro
        Bson filter = Filters.eq(claveF, valorF);
        //claveF - valorF de data nueva
        Bson nuevaActualizacion = Updates.set(claveModificada, valorModificado);
        UpdateResult resultado = collection.updateOne(filter, nuevaActualizacion);
        mostrarDatos.mostrarInformacionConcat(resultado.getMatchedCount(),"Total de datos acualizados: ");
    }

    public void filtrarDatos(String clave, String valor) {
        Bson filtro = Filters.eq(clave, valor);

        todaLaColeccion = collection.find(filtro);
        System.out.println("----------------");
        mostrarDatos.mostrarInformacionDocument(todaLaColeccion);

    }

}
