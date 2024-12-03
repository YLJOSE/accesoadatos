package Joyeria;

import java.util.ArrayList;
import java.util.Random;

public class Empleado extends Thread {
    ArrayList<Collar> collaresAzules = new ArrayList<Collar>();
    ArrayList<Collar> collaresBlancos = new ArrayList<Collar>();
    ArrayList<Collar> collaresMixtos = new ArrayList<Collar>();
    private Cesto cesto;
    private Collar collar = new Collar();

    public Empleado(Cesto cesto) {
        this.cesto = cesto;
    }

    @Override
    public void run() {
        do{
            int num;
            Random rnd = new Random();
            do {
                num = rnd.nextInt(3);
            } while (num == 0);
           // System.out.println(num);
            cesto.cogerPerla(num);
            collar.insertarPerla(num);
            if (collar.terminoCollar()) {
                System.out.println(this.getName().toString() +" Terminé un collar");
                try {
                    sleep(5000);
                    // this.collar = new Collar();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }while(!cesto.getFinish());
    }
}
