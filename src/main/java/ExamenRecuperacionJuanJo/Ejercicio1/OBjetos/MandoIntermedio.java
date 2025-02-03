package ExamenRecuperacionJuanJo.Ejercicio1.OBjetos;

public class MandoIntermedio extends Persona {
    private String comision;

    public MandoIntermedio(String nombre, String apellidos, int edad, String fechaIngresoEmpresa, String salarioBrutoAnual, String comision) {
        super(nombre, apellidos, edad, fechaIngresoEmpresa, salarioBrutoAnual);
        this.comision = comision;
    }

    public String getComision() {
        return comision;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + comision + "\n";
    }

    @Override
    public String toString() {
        return super.toString() + ";" + comision + "\n";
    }
}
