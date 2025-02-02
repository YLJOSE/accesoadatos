package Simulacro.reto2.Objetos;

public class Asignaturas {
    private String nombre;
    private double nota;

    public Asignaturas(String nombre, double calificacion) {
        this.nombre = nombre;
        this.nota = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre='" + nombre + '\'' + ", calificacion=" + nota + '}';
    }
}
