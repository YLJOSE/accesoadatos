package Simulacro.reto2.Objetos;

import Simulacro.reto2.TratamientoDatos.CalcularMedia;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private int id;
    private String nombre;
    private String apellidos;
    private List<Asignaturas> asignaturas;
    protected double mediaNotas;

    public Alumno(int id, String nombre, String apellidos, List<Asignaturas> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asignaturas = asignaturas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }


    public List<Asignaturas> getAsignaturas() {
        return asignaturas;
    }


    public void calcularMedia() {
        List<Double> notas = new ArrayList<>();
        for (int i = 0; i < asignaturas.size(); i++) {
            notas.add(asignaturas.get(i).getNota());
        }
        mediaNotas = CalcularMedia.calcular(notas);
    }

    public String[] vuelve() {
        calcularMedia();
        return new String[]{nombre, apellidos, String.valueOf(mediaNotas)};
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", asignaturas=" + asignaturas.toString() +
                '}';
    }
}
