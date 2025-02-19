package MongoDBEjercicios;

import MongoDBEjercicios.BBDDManager.mongoDBGestor;
import MongoDBEjercicios.BDCRUD.CRUDUsuario;
import MongoDBEjercicios.Interfaces.CRUD;
import MongoDBEjercicios.Objetos.usuario;

public class prueba {

    public static void main(String[] args) {
        CRUD<usuario> mongoRepo = new mongoDBGestor();
        CRUDUsuario CRUDUsuario = new CRUDUsuario(mongoRepo);

        // Insertar un usuario
        //CRUDUsuario.annadirUsuario("Cristiiii rodri", "cristirodri@juju.com");

        // Obtener todos los usuarios
        // CRUDUsuario.obtenerTodosLosUsuarios().forEach(usuario ->
        // System.out.println( usuario.getNombre() + " - " + usuario.getEmail()));
        // filtrar usuario
        //CRUDUsuario.obtenerUsuarioPorId("67b6077c8bf9ae57d16a9117");
        // Actualizar un usuario
        //CRUDUsuario.actualizarUsuarioPorId("67b6077c8bf9ae57d16a9117", "Luis Navarro", "luis@jujuj.com");

        // Eliminar un usuario
        CRUDUsuario.eliminarUsuarioPorId("67b6077c8bf9ae57d16a9117");
    }
}


