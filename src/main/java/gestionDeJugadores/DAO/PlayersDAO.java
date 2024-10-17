package gestionDeJugadores.DAO;

import gestionDeJugadores.DTO.Player;

import java.util.ArrayList;

import static gestionDeJugadores.Control.PrincipalClass.sc;

public class PlayersDAO {


    public static void addPlayer(ArrayList<Player> players) {

        String name;
        String lastName;
        int age;
        String dNI;
        boolean active = false;
        int optionActive;
        sc.nextLine();
        System.out.println("Nombre:");
        name = sc.nextLine();
        System.out.println("Apellido:");
        lastName = sc.nextLine();
        System.out.println("Edad:");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("DNI:");
        dNI = sc.nextLine();
        System.out.println("Está activo: 1. si 2. No");
        optionActive = sc.nextInt();
        if (optionActive == 1) {
            active = true;
        }

        Player player = new Player(name, lastName, age, dNI, active);
        players.add(player);

        players.forEach(jogador -> System.out.println(player.toString() + "\n"));


    }

    public static void viewOnePlayer() {

    }

    public static void viewPlayers() {

    }

    public static void restPlayer() {

    }

    public static void viewPlayersRest() {

    }

}
