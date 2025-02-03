package ExamenRecuperacionJuanJo.Ejercicio5.Main;

import ExamenRecuperacionJuanJo.Ejercicio1.Interfaces.Leer;
import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.Persona;
import ExamenRecuperacionJuanJo.Ejercicio3.GestorPropiedades.PropsGestor;
import ExamenRecuperacionJuanJo.Ejercicio5.GestorBBDD.BBDDGestor;
import ExamenRecuperacionJuanJo.Ejercicio5.Mostrar.MostrarDatos;

import java.util.List;

import static ExamenRecuperacionJuanJo.Ejercicio5.Mostrar.MostrarDatos.mostrarDatos;

public class main {


    public static void main(String[] args) {
        ExamenRecuperacionJuanJo.Ejercicio3.Interfaces.Leer gestoProps = new PropsGestor();
        List<String> props = gestoProps.leer();
        Leer bbdd = new BBDDGestor(props);


      //  List<Persona> personasSubOrdinadas = bbdd.leer();
       // mostrarDatos(personasSubOrdinadas);
    }
}
