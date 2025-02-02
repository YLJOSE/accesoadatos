package EjerciciosRecuperacion.EjercicioUno.Interfaces;

import EjerciciosRecuperacion.EjercicioUno.Objetos.Persona;

import java.io.IOException;
import java.util.List;

public interface Leer {

    List<Persona> leer() throws IOException;
}
