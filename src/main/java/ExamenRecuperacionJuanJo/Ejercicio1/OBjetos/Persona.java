package ExamenRecuperacionJuanJo.Ejercicio1.OBjetos;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String fechaIngresoEmpresa;
    private String salarioBrutoAnual;

    public Persona(String nombre, String apellidos, int edad, String fechaIngresoEmpresa, String salarioBrutoAnual) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaIngresoEmpresa = fechaIngresoEmpresa;
        this.salarioBrutoAnual = salarioBrutoAnual;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setFechaIngresoEmpresa(String fechaIngresoEmpresa) {
        this.fechaIngresoEmpresa = fechaIngresoEmpresa;
    }

    public String getFechaIngresoEmpresa() {
        return fechaIngresoEmpresa;
    }

    public String getSalarioBrutoAnual() {
        return salarioBrutoAnual;
    }

    public String toCSV() {
        return nombre + ";" + apellidos + ";" + edad + ";" + fechaIngresoEmpresa + ";" + salarioBrutoAnual + ";";
    }

    @Override
    public String toString() {
        return nombre + ";" + apellidos + ";" + edad + ";" + fechaIngresoEmpresa + ";" + salarioBrutoAnual;
    }
}
