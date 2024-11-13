package hilos;

import java.util.Random;

public class Padre extends Thread implements Runnable {
    private static Boolean[] hilos;
    private static int iterator = 0;
    private int num_hilos;

    public Padre(int numHilos) {
        this.num_hilos = numHilos;
        if (hilos == null) {
            hilos = new Boolean[numHilos];
            for (int i = 0; i < numHilos; i++) {
                hilos[i] = false;
            }
        }
    }

    @Override
    public void run() {
        int num;
        do {
            num = new Random().nextInt() % 3 * 1000;
        } while (num < 0);
        String id = Thread.currentThread().getName();
        System.out.println("Hilo [" + id + "] ==> Voy a dormir");
        try {
            Thread.sleep(num);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hilo [" + id + "] ==> Desperté");

        hilos[iterator] = true;
        iterator++;

        if (isFinished()) {
            System.out.println("finalizaron todos!!");
        }

    }

    public boolean isFinished() {
        int count = 0;
        for (int i = 0; i < num_hilos; i++) {
            if (hilos[i] == false) {
                count = 0;
                break;
            } else {
                count++;
            }
        }
        if (count == num_hilos) {
            return true;
        }
        return false;
    }
}
