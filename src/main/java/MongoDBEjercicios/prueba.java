package MongoDBEjercicios;

import MongoDBEjercicios.BBDDManager.mongoDBGestor;
import MongoDBEjercicios.BDCRUD.CRUDUsuario;
import MongoDBEjercicios.Interfaces.CRUD;
import MongoDBEjercicios.Objetos.usuario;

public class prueba {

    public static void main(String[] args) {
        CRUD<usuario> mongoRepo = new mongoDBGestor("local", "users");
        CRUDUsuario CRUDUsuario = new CRUDUsuario(mongoRepo);

        // Insertar un usuario
        CRUDUsuario.annadirUsuario("Carlos perez", "carlosperez@juju.com");

        // Obtener todos los usuarios
       // CRUDUsuario.obtenerTodosLosUsuarios().forEach(usuario ->
              // System.out.println( usuario.getNombre() + " - " + usuario.getEmail()));
        // filtrar usuario
      // CRUDUsuario.obtenerUsuarioPorNombre("Juan Pérez");
        // Actualizar un usuario
        CRUDUsuario.actualizarUsuarioPorNombre("Juan Pérez actualizado", "Luis Navarro", "luis@jujuj.com");

        // Eliminar un usuario
        // CRUDUsuario.eliminarUsuarioPorNombre("Juan Pérez");
    }
}


