package Calculadora.Operaciones;

public class Sumar {
    private double resultado;
    private double n1;
    private double n2 ;
    public Sumar(double num1, double num2){
        this.n1 = num1;
        this.n2 = num2;
    }
    public double operacion() {
        resultado = n1 + n2;
        return resultado;
    }
}
