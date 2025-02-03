package ExamenRecuperacionJuanJo.Ejercicio2.GestorCsv;

import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.Empresa;
import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.MandoIntermedio;
import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.Persona;
import ExamenRecuperacionJuanJo.Ejercicio2.Interfaces.Escribir;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class GestorCsv2 implements Escribir {
    Empresa empleados;

    public GestorCsv2(Empresa empleados) {
        this.empleados = empleados;
    }


    @Override
    public void escribir() {
        try {
            List<Persona> sub = empleados.getSubordinados();
            List<MandoIntermedio> mandos = empleados.getMandoIntermedio();

            File fichero = new File("subordinados.csv");
            File fichero2 = new File("mandosIntermedios.csv");


            FileWriter fileWriter = new FileWriter(fichero, true);

            for (Persona p : sub) {
                fileWriter.write(p.toCSV() + "\n");

            }

            fileWriter.close();

            System.out.println("subida a csv de subordinados lista!");

            FileWriter fileWriter2 = new FileWriter(fichero2, true);

            for (MandoIntermedio d : mandos) {
                fileWriter2.write(d.toCSV());

            }
            System.out.println("subida mandos listo!");

            fileWriter2.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
