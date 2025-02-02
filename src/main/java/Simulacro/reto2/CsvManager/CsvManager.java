package Simulacro.reto2.CsvManager;

import Simulacro.reto2.Interfaces.Escribir;
import Simulacro.reto2.Objetos.Alumno;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvManager implements Escribir {
    protected String ruta;
    protected List<Alumno> alumnos;

    public CsvManager(String ruta, List<Alumno> alumnos) {
        this.ruta = ruta;
        this.alumnos = alumnos;
        File fichero = new File(ruta);
        if (!fichero.exists()) {
            try {
                fichero.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void escribir() {
        try (FileWriter fileWriter = new FileWriter(new File(ruta), true)) {
            for (int i = 0; i < alumnos.size(); i++) {
                String[] array = alumnos.get(i).vuelve();
                for (int j = 0; j < array.length; j++) {
                    fileWriter.append(array[j]);
                    fileWriter.append(";");
                }
                fileWriter.append("\n");
            }
            System.out.println("El jugador se agregó correctamente!!");
        } catch (IOException e) {
            System.err.println("error al ingresar datos al csv");
        }

    }
}
