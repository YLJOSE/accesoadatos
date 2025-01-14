package Calculadora.Interfaz;


import Calculadora.Operando.Logica;

import static Calculadora.Input.InputDatos.updateNum;

public class MenuUsuario {
    public void menu(int option) {

        switch (option) {
            case 0:
                System.out.println("Gracias por usar la app!!!!");
                break;
            case 1:
                Logica.operando();
                // realizar operaciones
                break;
            case 2:
                updateNum();
                // subir un número
                break;
            default:


        }


    }
}
