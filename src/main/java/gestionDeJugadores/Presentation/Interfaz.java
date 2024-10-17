package gestionDeJugadores.Presentation;

import gestionDeJugadores.DTO.Player;

import java.util.ArrayList;

import static gestionDeJugadores.Control.PrincipalClass.sc;
import static gestionDeJugadores.DAO.PlayersDAO.*;

public class Interfaz {
    // menu


    public static void menu(ArrayList<Player> players) {

        int option;
        do {
            System.out.println("1. Dar de alta un jugador.\n2.Mostrar un jugador.\n3.Mostrar todos los jugadores.\n4.Dar de baja un juagador\n5.Ver jugadores en baja");
            option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    addPlayer(players);
                }
                case 2 -> {
                    viewOnePlayer();
                }
                case 3 -> {
                    viewPlayers();
                }
                case 4 -> {
                    restPlayer();
                }
                case 5 -> {
                    viewPlayersRest();
                }
            }


        } while (option > 6 | option < 1);
    }
}
