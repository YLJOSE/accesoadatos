package gestionDeJugadores.Presentation;

import java.util.InputMismatchException;

import static gestionDeJugadores.Control.PrincipalClass.sc;
import static gestionDeJugadores.DAO.PlayersDAO.*;

public class Interfaz {


    public static void menu() {

        int option;
        boolean exceptionControl = false;
        boolean exitProgram = false;
        do {
            System.out.println("\n1. Dar de alta un jugador.\n2.Mostrar un jugador.\n3.Mostrar todos los jugadores.\n4.Ver jugadores en baja. \n0.SALIR");
            try {
                option = sc.nextInt();
                exceptionControl = true;
                switch (option) {
                    case 0 -> {

                        System.out.println("Saliendo del programa........");
                        exitProgram = true;
                    }
                    case 1 -> {
                        addPlayer();
                    }
                    case 2 -> {
                        viewOnePlayer();
                    }
                    case 3 -> {
                        viewPlayers();
                    }
                    case 4 -> {
                        viewPlayersRest();
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
