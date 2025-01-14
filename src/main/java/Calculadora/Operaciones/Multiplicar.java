package Calculadora.Operaciones;

public class Multiplicar {
    private double resultado;
    private double n1;
    private double n2 ;
    public Multiplicar(double num1, double num2){
        this.n1 = num1;
        this.n2 = num2;
    }
    public double operacion() {
        resultado = n1 * n2;
        return resultado;
    }
}
