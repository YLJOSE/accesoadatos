package MongoDBEjercicios.GestorBD;

import MongoDBEjercicios.Interfaces.CRUD;
import org.bson.Document;

import java.util.List;

public class GestorBBDD implements CRUD<Document> {
    @Override
    public List<Document> leer() {
        return List.of();
    }

    @Override
    public void escribir(Document generics) {

    }

    @Override
    public void actualizar(String clave, String valor, Document generics) {

    }

    @Override
    public void borrar(String clave, String valor) {

    }

    @Override
    public void borrarTodo() {

    }

    @Override
    public void filtrarDatos(String clave, String valor) {

    }
}
