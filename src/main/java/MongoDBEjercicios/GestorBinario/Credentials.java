package MongoDBEjercicios.GestorBinario;

import java.io.Serializable;

public class Credentials implements Serializable {

    private String ruta;
    private String bbddNombre;
    private String nombreColeccion;

    public Credentials() {

    }

    public Credentials(String ruta, String bbddNombre, String nombreColeccion) {
        this.ruta = ruta;
        this.bbddNombre = bbddNombre;
        this.nombreColeccion = nombreColeccion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getBbddNombre() {
        return bbddNombre;
    }

    public void setBbddNombre(String bbddNombre) {
        this.bbddNombre = bbddNombre;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    @Override
    public String toString() {
        return  ruta +"/"+ bbddNombre +"/"+  nombreColeccion;
    }
}
