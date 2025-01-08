package Examples;

import java.util.Random;
import java.util.Scanner;

public class RandomPlay {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // cuadrado();
        // game();
        triangulo();
    }

    static void game() {
        int numberUser;
        System.out.println("Insert number: ");
        numberUser = sc.nextInt();
        randomNumber(numberUser);
    }

    static void cuadrado() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 25; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangulo() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }

    static void randomNumber(int user) {
        Random rnd = new Random();
        int number = 0;
        number = rnd.nextInt(10) + 1;

        if (user == number) {
            System.out.println("CONGRATULATIONS!!!");
        } else {
            System.err.println("No le atinaste!");
            game();
        }

    }
}
