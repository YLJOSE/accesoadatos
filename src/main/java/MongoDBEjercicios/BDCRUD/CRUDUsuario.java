package MongoDBEjercicios.BDCRUD;

import MongoDBEjercicios.Interfaces.CRUD;
import MongoDBEjercicios.Objetos.usuario;
import org.bson.types.ObjectId;

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

    public usuario obtenerUsuarioPorId(String id) {
        return userRepository.filtrarPorId(new ObjectId(id));
    }

    public List<usuario> obtenerTodosLosUsuarios() {
        return userRepository.obtenerTodosLosDocumentos();
    }

    public void actualizarUsuarioPorId(String id, String name, String email) {
        usuario usuario = new usuario(name, email);
        userRepository.actualizarPorId(new ObjectId(id), usuario);
    }

    public void eliminarUsuarioPorId(String id) {
        userRepository.eliminarPorId(new ObjectId(id));
    }
}
