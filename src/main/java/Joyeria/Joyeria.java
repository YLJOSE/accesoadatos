package Joyeria;

public class Joyeria {
    // Definimos los máximos de perlas en cada cesto
    public static final int MAX_BLUE = 210;
    public static final int MAX_WHT = 180;

    public static void main(String[] args) {
        // Inicializamos los cestos
        Cesto cestoAzul = new Cesto(MAX_BLUE, 0);
        Cesto cestoBlanco = new Cesto(0, MAX_WHT);

        // Creamos 5 empleados
        Empleado e1 = new Empleado(cestoAzul, new Collar(), 1); // Collar blanco
        Empleado e2 = new Empleado(cestoBlanco, new Collar(), 2); // Collar azul
        Empleado e3 = new Empleado(cestoAzul, new Collar(), 3); // Collar mixto
        Empleado e4 = new Empleado(cestoBlanco, new Collar(), 1); // Collar blanco
        Empleado e5 = new Empleado(cestoAzul, new Collar(), 3); // Collar mixto

        // Inicio hilos
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
            e.printStackTrace();
        }
        System.out.println("Total de collares fabricados: " + Empleado.getTotalCollares());
    }
}
/*
 * teoria tipo text
 * preguntas cortas
 * parte practica
 * que es un proceso, estados, hilo,...? */