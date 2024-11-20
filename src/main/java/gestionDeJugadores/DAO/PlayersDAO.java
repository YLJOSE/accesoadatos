package gestionDeJugadores.DAO;

import gestionDeJugadores.DTO.Player;
import gestionDeJugadores.FileManagment.FileManager;

import java.util.ArrayList;

import static gestionDeJugadores.Control.PrincipalClass.sc;

public class PlayersDAO {
    static FileManager fm = new FileManager();

    public static void addPlayer() {

        boolean active = false;
        int optionActive;
        sc.nextLine();
        System.out.println("Nombre:");
        String name = sc.nextLine();
        System.out.println("Apellido:");
        String lastName = sc.nextLine();
        System.out.println("Edad:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("DNI:");
        String dNI = sc.nextLine();
        System.out.println("Está activo: 1. sí 2. No");
        optionActive = sc.nextInt();
        if (optionActive == 1) {
            active = true;
        }

        Player player = new Player(name, lastName, age, dNI, active);
        fm.writePLayers(player);


    }

    public static void viewOnePlayer() {
        System.out.println("Ingresa el indice del jugador que quieres ver:");
        int index = sc.nextInt();
        fm.readOnlyIndex(index);

    }

    public static void viewPlayers() {
        fm.readPlayers();
    }

    public static void viewPlayersRest() {
        fm.viewNoActive();
    }

}
