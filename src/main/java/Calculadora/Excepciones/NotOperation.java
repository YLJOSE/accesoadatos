package Calculadora.Excepciones;

public class NotOperation extends RuntimeException {
    public NotOperation(String message) {
        super(message);
    }
}
