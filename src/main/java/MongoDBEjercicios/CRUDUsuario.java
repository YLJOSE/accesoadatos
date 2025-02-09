package MongoDBEjercicios;

import java.util.List;

public class CRUDUsuario {
    private final CRUD<usuario> userRepository;

    public CRUDUsuario(CRUD<usuario> userRepository) {
        this.userRepository = userRepository;
    }

    public void annadirUsuario(String name, String email) {
        usuario usuario = new usuario(name, email);
        userRepository.insertarUsuario(usuario);
    }

    public usuario obtenerUsuarioPorNombre(String nombre) {
        return userRepository.filtrarPorNombre(nombre);
    }

    public List<usuario> obtenerTodosLosUsuarios() {
        return userRepository.obtenerTodosLosDocumentos();
    }

    public void actualizarUsuarioPorNombre(String nombre, String name, String email) {
        usuario usuario = new usuario(name, email);
        userRepository.actualizarPorNombre(nombre, usuario);
    }

    public void eliminarUsuarioPorNombre(String nombre) {
        userRepository.eliminarPorNombre(nombre);
    }
}
