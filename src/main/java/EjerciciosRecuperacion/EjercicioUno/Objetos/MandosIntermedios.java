package EjerciciosRecuperacion.EjercicioUno.Objetos;

public class MandosIntermedios extends Persona {
    private String comision;

    public String getComision() {
        return comision;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncomision: " + comision;
    }
}
