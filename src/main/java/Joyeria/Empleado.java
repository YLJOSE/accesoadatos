package Joyeria;

import java.util.Random;

public class Empleado  extends  Thread {
    private Cesto cesto;
    private Collar collar;
    private int tipoCollar; // 1 para blanco, 2 para azul, 3 para mixto
    private static int totalCollares = 0;

    public Empleado(Cesto cesto, Collar collar, int tipoCollar) {
        this.cesto = cesto;
        this.collar = collar;
        this.tipoCollar = tipoCollar;
    }

    @Override
    public void run() {
        try {
            while (!collar.isComplete()) {
                // Determinamos el color de la perla a coger
                int color = (tipoCollar == 3) ? (collar.getPerlas().size() % 2 == 0 ? 1 : 2) : tipoCollar;

                Perla perla = cesto.cogerPerla(color);

                // Insertamos la perla en el collar
                collar.insertarPerla(perla);
            }

            synchronized (Empleado.class) {
                totalCollares++;
            }
        } catch (NoMaterialsLeft e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getTotalCollares() {
        return totalCollares;
    }
}