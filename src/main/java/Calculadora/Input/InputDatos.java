package Calculadora.Input;

import Calculadora.Interfaz.MenuUsuario;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Calculadora.Interfaz.Presentacion.presentacion;
import static Calculadora.Operando.Logica.subirNumero;

public class InputDatos {
    static Scanner sc = new Scanner(System.in);

    public static void usuario() {
        int option = 0;

        MenuUsuario menu = new MenuUsuario();

        presentacion();
        try {
            option = sc.nextInt();

        } catch (InputMismatchException e) {
            System.err.println("Error! Por favor ingresa un número!!");

        }
        if (option > 2) {
            usuario();
        } else {
            menu.menu(option);
        }

    }

    public static void app() {
        usuario();
    }

    public static void updateNum() {
        double numero = 0;
        System.out.println("Ingresa el número a subir:");
        numero = sc.nextDouble();
        subirNumero(numero);

    }


}
