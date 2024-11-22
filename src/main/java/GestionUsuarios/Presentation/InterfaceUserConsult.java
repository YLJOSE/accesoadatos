package GestionUsuarios.Presentation;

import SubsistemaGestionUsuarios.ControlBBDD;

import java.util.InputMismatchException;

import static SubsistemaGestionUsuarios.UserMetodos.verUsuarios;
import static gestionDeJugadores.Control.PrincipalClass.sc;

public class InterfaceUserConsult {
    public static void menuUsuarioConsulta(ControlBBDD bbdd){
        int option;
        boolean exceptionControl = false;
        boolean exitProgram = false;
        do {
            System.out.println("\n1.Mostrar usuarios. \n0.SALIR");
            try {
                option = sc.nextInt();
                exceptionControl = true;
                switch (option) {
                    case 0 -> {
                        System.out.println("Saliendo del programa........");
                        bbdd.closeConection();
                        exitProgram = true;
                    }
                    case 1 -> {
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
