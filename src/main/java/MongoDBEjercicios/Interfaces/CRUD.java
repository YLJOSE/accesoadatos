package MongoDBEjercicios.Interfaces;

import org.bson.types.ObjectId;

import java.util.List;

public interface CRUD<T> {
    void insertarUsuario(T entity);
    T filtrarPorId(ObjectId objectId);
    List<T> obtenerTodosLosDocumentos();
    void actualizarPorId(ObjectId objectId, T entity);
    void eliminarPorId(ObjectId objectId);
}
