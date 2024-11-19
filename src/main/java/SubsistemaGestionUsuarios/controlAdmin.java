package SubsistemaGestionUsuarios;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import static SubsistemaGestionUsuarios.UserMetodos.altaUsuario;
import static SubsistemaGestionUsuarios.UserMetodos.verUsuarios;
import static gestionDeJugadores.Control.PrincipalClass.sc;


public class controlAdmin {

    public static void menu() {

        int option;
        boolean exceptionControl = false;
        boolean exitProgram = false;
        do {
            System.out.println("\n1. Dar de alta un usuario.\n2.Mostrar un usuario. \n0.SALIR");
            try {
                option = sc.nextInt();
                exceptionControl = true;
                switch (option) {
                    case 0 -> {

                        System.out.println("Saliendo del programa........");
                        exitProgram = true;
                    }
                    case 1 -> {
                        altaUsuario();
                    }
                    case 2 -> {
                        verUsuarios();
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
