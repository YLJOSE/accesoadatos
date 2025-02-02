package EjerciciosRecuperacion.EjercicioUno.CRUD;

import EjerciciosRecuperacion.EjercicioUno.Interfaces.Leer;
import EjerciciosRecuperacion.EjercicioUno.Objetos.Persona;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class MetodosCRUD {
    private List<Persona> empleadoss;

    public MetodosCRUD(Leer managerJson) throws FileNotFoundException {
        try {
            this.empleadoss = managerJson.leer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void listarEmpleados() {
        for (Persona persona : empleadoss) {

            System.out.println(persona.toString());
            System.out.println();
        }

    }

    public void annadirEmpleado(Persona empleado) {
        this.empleadoss.add(empleado);
    }
    public void borrarempleado(String nombre){
        for (Persona persona: empleadoss){
            if(persona.getNombre().equalsIgnoreCase(nombre)){
                empleadoss.remove(persona);
            }
        }
    }
    public void actualizarEmpleado(String nombre,String salario){

        for (Persona persona: empleadoss){
            if(persona.getNombre().equalsIgnoreCase(nombre)){
                persona.setSalario(salario);
            }
        }
    }
}
