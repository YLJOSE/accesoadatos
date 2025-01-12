package Calculadora.Input;

import Calculadora.Interfaz.MenuUsuario;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Calculadora.Interfaz.Presentacion.presentacion;

public class Inputdatos {

    public static void usuario() {
        int option = 0;
        Scanner sc = new Scanner(System.in);
        MenuUsuario menu = new MenuUsuario();

        presentacion();
        try {
            option = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Error! Por favor ingresa un número!!");
            usuario();
        }

        sc.close();
        menu.menu(option);
    }

    public static void app() {
        usuario();
    }


}
