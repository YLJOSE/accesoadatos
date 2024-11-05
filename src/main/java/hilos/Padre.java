package hilos;

import java.util.ArrayList;

public class Padre extends Thread implements Runnable {
    private String nameThread;
    private static Boolean[] hilos = new Boolean[10];
    static int iterator = 0;

    @Override
    public void run() {
        System.out.println("Soy el hilo: " + nameThread);
    }

    public void setTitle(String name) {
        this.nameThread = name;
    }


    public void termino() {
        if (!this.isAlive()) {
            hilos[iterator] = true;
            iterator++;

        }
    }

    public static Boolean[] getHilos() {
        return hilos;
    }
}
