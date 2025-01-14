package BaseDeDatosSegundoTrimestre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfaz {
    private static Scanner sc = new Scanner(System.in);

    public void ayuda(){

        int option;
        boolean exceptionControl = false;
        boolean exitProgram = false;
        do {
            System.out.println("\n1. Sumar.\n2.Guardar en memoria. \n0.SALIR");
            try {
                option = sc.nextInt();
                exceptionControl = true;
                switch (option) {
                    case 0 -> {
                        System.out.println("Saliendo del programa........");
                        exitProgram = true;
                    }
                    case 1 -> {

                    }
                    case 2 -> {
                        System.out.println();
                    }

                    default -> {
                        exitProgram = false;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un numero por favor!\n");
                sc.nextLine();
            }

        } while (!exceptionControl || !exitProgram);
    }
}
