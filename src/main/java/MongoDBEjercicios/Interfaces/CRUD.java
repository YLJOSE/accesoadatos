package MongoDBEjercicios.Interfaces;

import java.util.List;

public interface CRUD <T>{
    List<T> leer();
    void escribir(T generics);
    void actualizar(String clave, String valor, T generics);
    void borrar(String clave, String valor);
    void borrarTodo();
    void filtrarDatos(String clave, String valor);
}
