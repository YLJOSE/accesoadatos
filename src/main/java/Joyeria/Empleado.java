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

        do {
            try {
                int num = 1;


                if (this.cesto.getFinishPerlasAzules()) {
                    num = 2;
                }
                System.out.println(num);

                cesto.cogerPerla(num);
                collar.insertarPerla(num);
                if (collar.terminoCollar()) {
                    collaresMixtos.add(collar);
                    try {
                        Thread.sleep(5000);
                        this.collar = new Collar();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + this.cesto.getContadorBlue() + " " + this.cesto.getContadorWht());
            } catch (NoMaterialsLeft e) {
                throw new RuntimeException(e);
            }
        } while (!this.cesto.getFinish());

        System.out.println("Soy.. " + this.getName().toString() + " y hice " + collaresMixtos.size());
    }
}
