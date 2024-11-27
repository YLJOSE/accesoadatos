package Joyeria;

import java.util.Random;

public class Empleado implements Runnable {
    @Override
    public void run() {

        int numeroEmpleados;
        do {
            numeroEmpleados = new Random().nextInt(20);
        }while(numeroEmpleados <20);
        System.out.println(numeroEmpleados);
    }
}