package hilos;

import java.util.ArrayList;

public class PadreApp {
    public static void main(String[] args) {
        int numHilos = 6;
        Thread[] arrayHilos = new Thread[numHilos];
        for (int i = 0; i < numHilos; i++) {
            arrayHilos[i] = new Thread(new Padre(numHilos));
            arrayHilos[i].start();
        }

    }
}
