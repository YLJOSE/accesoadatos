package Calculadora.Operando;

import Calculadora.BBDDManager.BBDDManager;
import Calculadora.Operaciones.*;

public class Logica {
    public static void operando(double numb) {
        BBDDManager manager = new BBDDManager();
        double number;
        number = manager.QueryNumber();
        Dividir d = new Dividir(numb, number);
        System.out.println(d.operacion());


    }
}
