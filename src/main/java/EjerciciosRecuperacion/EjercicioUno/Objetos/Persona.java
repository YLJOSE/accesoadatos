package EjerciciosRecuperacion.EjercicioUno.Objetos;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String fechaIngreso;
    private String salario;

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setSalario(String salario) {
        this.salario = salario;
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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\napellidos: " + apellidos + "\nedad: " + edad + "\nfecha ingreso: " + fechaIngreso + "\nsalario bruto: " + salario;
    }
    public String toCSV() {
        return nombre + ";" + apellidos + ";" + edad + ";" + fechaIngreso + ";" + salario + "\n";
    }
}
