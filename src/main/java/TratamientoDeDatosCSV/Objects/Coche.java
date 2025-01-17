package TratamientoDeDatosCSV.Objects;

public class Coche {
    private int id;
    private String motor;
    private String placa;
    private String descripcion;
    private String annoFabricacion;

    public Coche(int id, String motor, String placa, String descripcion, String annoFabricacion) {
        this.id = id;
        this.motor = motor;
        this.placa = placa;
        this.descripcion = descripcion;
        this.annoFabricacion = annoFabricacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAnnoFabricacion() {
        return annoFabricacion;
    }

    public void setAnnoFabricacion(String annoFabricacion) {
        this.annoFabricacion = annoFabricacion;
    }

    @Override
    public String toString() {
        return "Coche{" + "id=" + id + ", motor='" + motor + '\'' + ", placa='" + placa + '\'' + ", descripcion='" + descripcion + '\'' + ", annoFabricacion='" + annoFabricacion + '\'' + '}';
    }
}
