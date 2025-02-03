package ExamenRecuperacionJuanJo.Ejercicio5.Mostrar;

import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.Persona;

import java.util.List;

public class MostrarDatos {
    public static void mostrarDatos(List<Persona> subOrdinados) {
        System.out.println("Estos son los subordinados:");
        subOrdinados.forEach(sub -> System.out.println(sub.toString()));

    }
}
