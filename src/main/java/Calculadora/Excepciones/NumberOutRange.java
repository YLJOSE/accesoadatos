package Calculadora.Excepciones;

public class NumberOutRange extends RuntimeException {
    public NumberOutRange(String message) {
        super(message);
    }
}
