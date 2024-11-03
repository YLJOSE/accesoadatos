package gestionDeJugadores.DAO;

import gestionDeJugadores.DTO.Player;
import gestionDeJugadores.FileManagment.FileManager;

import java.util.ArrayList;

import static gestionDeJugadores.Control.PrincipalClass.sc;

public class PlayersDAO {
    static FileManager fm = new FileManager();

    public static void addPlayer() {

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

    public static void restPlayer() {
        int id, confirm;
        System.out.println("Ingresa el id del jugador que quieres eliminar:");
        sc.nextLine();
        id = sc.nextInt();
        fm.readOnlyIndex(id);
        System.out.println("Ingresa 1 para confirmar la baja!");
        sc.nextLine();
        confirm = sc.nextInt();
        if(confirm == 1){

        }else{
            System.out.println("Numweo mal ingresado intentelo de nuevo...");
        }
    }

    public static void viewPlayersRest() {

    }

}
