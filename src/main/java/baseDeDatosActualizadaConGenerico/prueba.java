package baseDeDatosActualizadaConGenerico;

import baseDeDatosActualizadaConGenerico.BBDDCRUD.CRUDUsuario;
import baseDeDatosActualizadaConGenerico.GestorBaseDeDatos.MySqLDBGestor;
import baseDeDatosActualizadaConGenerico.Interfaces.CRUD;
import baseDeDatosActualizadaConGenerico.Objetos.Persona;

public class prueba {
    public static void main(String[] args) {
        CRUD<Persona> repositorio = new MySqLDBGestor();
        CRUDUsuario crudUsuario = new CRUDUsuario(repositorio);


        Persona persona = new Persona("pedro","ruiz",20);
        crudUsuario.annadir(persona);
    }
}
