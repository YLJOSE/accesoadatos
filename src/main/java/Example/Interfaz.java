package Example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfaz {
    private static Scanner sc = new Scanner(System.in);
    private static FileManager fm = new FileManager();

    public static void menu() {

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
                        sumar();
                    }
                    case 2 -> {
                        guardarMemoria();
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

    public static void sumar() {
        int num;
        System.out.println("Ingresa un numero: ");
        num = sc.nextInt();
        int sumTotal = num + fm.readNumber();
        System.out.println("El resultado final es: " + sumTotal);
        menu();
    }

    public static void guardarMemoria() {
        int n;
        System.out.println("Ingresa un numero: ");
        n = sc.nextInt();
        fm.writeNumber(String.valueOf(n));
    }

}
