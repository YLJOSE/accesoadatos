package hilos;

import java.util.Random;

public class Jugador extends Thread {

    ayuda ping;
    ayuda pong;

    public Jugador(ayuda uno, ayuda dos) {
        this.ping = uno;
        this.pong = dos;
    }

    @Override
    public void run() {

        this.jugar();
    }

    public void jugar() {
        while (true) {
            System.out.println(ping.getSName());
            try {

                Random rnd = new Random();
                int a;

                do {
                    a = rnd.nextInt();
                } while (a < 1000);
                sleep(a);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(pong.getSName());
        }

    }
}

class ayuda extends Thread {
    String name;

    public ayuda(String name) {
        this.name = name;
    }


    public String getSName() {
        return name;
    }
}
