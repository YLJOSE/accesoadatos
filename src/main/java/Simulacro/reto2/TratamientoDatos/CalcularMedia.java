package Simulacro.reto2.TratamientoDatos;

import java.util.List;

public class CalcularMedia {
    public static double calcular(List<Double> notas) {
        double media;
        double suma = 0;
        for (int i = 0; i < notas.size(); i++) {
            suma += notas.get(i);
        }
        media = suma / notas.size();
        return media;
    }
}
