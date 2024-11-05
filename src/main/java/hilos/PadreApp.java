package hilos;

import java.util.ArrayList;

public class PadreApp {
    public static void main(String[] args) {

        String nameHilo;
        for (int i = 0; i < 10; i++) {
            nameHilo = String.valueOf(i);
            Padre hilo = new Padre();
            hilo.setTitle(nameHilo);


        }

    }
}
