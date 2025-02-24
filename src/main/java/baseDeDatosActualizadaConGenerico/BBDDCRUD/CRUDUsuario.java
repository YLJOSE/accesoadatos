package baseDeDatosActualizadaConGenerico.BBDDCRUD;


import baseDeDatosActualizadaConGenerico.Interfaces.CRUD;
import baseDeDatosActualizadaConGenerico.Objetos.Persona;

import java.util.List;

public class CRUDUsuario {
    private final CRUD<Persona> usuarioBBDD;

    public CRUDUsuario(CRUD<Persona> usuarioBBDD) {
        this.usuarioBBDD = usuarioBBDD;
    }

    public void annadir(Persona persona) {
        usuarioBBDD.insertarUsuario(persona);

    }

    public Persona filtrarPorid(int id) {

        return usuarioBBDD.filtrarPorId(id);
    }

    public List<Persona> obtenerTodosLosObjetos() {

        return usuarioBBDD.obtenerTodosLosObjetos();

    }

    public void actualizarPorId(int id, Persona persona) {

        usuarioBBDD.actualizarPorId(id, persona);

    }

    public void eliminarPorId(int id) {
        usuarioBBDD.eliminarPorId(id);


    }

}
