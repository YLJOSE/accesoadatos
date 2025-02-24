package baseDeDatosActualizadaConGenerico.Objetos;

import MongoDBEjercicios.Interfaces.CRUD;

import java.util.List;

public class Persona {

    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return  "id: " + id + "\nnombre: " + nombre  + "\napellidos:" + apellidos + '\'' + ", edad=" + edad + '}';
    }
}