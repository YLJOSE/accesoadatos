package Joyeria;

public class Joyería {
    public static void main(String[] args) {
        Cesto cestoUno = new Cesto();
        Cesto cestoDos = new Cesto();

        /**/


        Empleado e1 = new Empleado(cestoUno);
        Empleado e2 = new Empleado(cestoDos);
        Empleado e3 = new Empleado(cestoUno);
        Empleado e4 = new Empleado(cestoDos);
        Empleado e5 = new Empleado(cestoDos);

        e1.start();
        e2.start();
        e3.start();
        e4.start();
        e5.start();


        try {

                e1.join();
                e2.join();
                e3.join();
                e4.join();
                e5.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

/*
 * teoria tipo text
 * preguntas cortas
 * parte practica
 * que es un proceso, estados, hilo,...? */