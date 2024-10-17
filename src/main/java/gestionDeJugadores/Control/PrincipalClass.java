package gestionDeJugadores.Control;

import gestionDeJugadores.DTO.Player;

import java.util.ArrayList;
import java.util.Scanner;

import static gestionDeJugadores.Presentation.Interfaz.menu;

public class PrincipalClass {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        menu(players);


    }



}
