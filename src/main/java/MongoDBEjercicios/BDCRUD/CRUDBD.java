package MongoDBEjercicios.BDCRUD;

import MongoDBEjercicios.Interfaces.CRUD;
import org.bson.Document;

import java.util.List;

public class CRUDBD {
    private final CRUD<Document> metodosCRUD;

    public CRUDBD(CRUD<Document> metodosCRUD) {
        this.metodosCRUD = metodosCRUD;
    }

    public List<Document> mostrarTodasLasTablas() {
        return metodosCRUD.leer();
    }
}
