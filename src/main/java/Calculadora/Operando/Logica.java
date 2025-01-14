package Calculadora.Operando;

import Calculadora.BBDDManager.BBDDManager;
import Calculadora.Operaciones.*;
import Calculadora.OutputDatos.Output;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Logica {
    public static void operando() {
        Scanner sc = new Scanner(System.in);
        BBDDManager manager = new BBDDManager();
        double number;
        double numeroOperar;
        String operador;
        double resultado;

        System.out.println("Ingresa el número a operar: ");
        numeroOperar = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ahora ingresa el operador:\n 1. + \n 2. - \n 3. * \n 4. /");
        operador = sc.nextLine();

        number = manager.QueryNumber();
        manager.closeConnection();
        if (operador.equalsIgnoreCase("+")) {
            Sumar sumar = new Sumar(numeroOperar, number);
            resultado = sumar.operacion();

        } else if (operador.equalsIgnoreCase("-")) {
            Restar restar = new Restar(numeroOperar, number);
            resultado = restar.operacion();
        } else if (operador.equalsIgnoreCase("*")) {
            Multiplicar multiplicar = new Multiplicar(numeroOperar, number);
            resultado = multiplicar.operacion();
        } else {
            Dividir dividir = new Dividir(numeroOperar, number);
            resultado = dividir.operacion();
        }


        Output.salidaDatos(resultado);


    }

    public static void subirNumero(double numero) {
        BBDDManager manager = new BBDDManager();
        manager.updateBBDD(numero, String.valueOf(LocalDateTime.now()));
        manager.closeConnection();

    }
}
