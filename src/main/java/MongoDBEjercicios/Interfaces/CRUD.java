package MongoDBEjercicios.Interfaces;

import org.bson.types.ObjectId;

import java.util.List;

public interface CRUD<T> {
    void insertarUsuario(T entity);
    T filtrarPorNombre(ObjectId objectId);
    List<T> obtenerTodosLosDocumentos();
    void actualizarPorNombre(ObjectId objectId, T entity);
    void eliminarPorNombre(ObjectId objectId);
}
