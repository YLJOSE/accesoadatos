package MongoDBEjercicios;

import java.util.List;

public interface CRUD<T> {
    void insertarUsuario(T entity);
    T filtrarPorNombre(String nombre);
    List<T> obtenerTodosLosDocumentos();
    void actualizarPorNombre(String nombre, T entity);
    void eliminarPorNombre(String nombre);
}
