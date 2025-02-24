package baseDeDatosActualizadaConGenerico.Interfaces;

import java.util.List;

public interface CRUD<T> {
    void insertarUsuario(T entidad);
    T filtrarPorId(int id);
    List<T> obtenerTodosLosObjetos();
    void actualizarPorId(int id, T entidad);
    void eliminarPorId(int id);
}