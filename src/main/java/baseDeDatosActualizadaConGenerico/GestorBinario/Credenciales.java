package baseDeDatosActualizadaConGenerico.GestorBinario;


import java.io.File;
import java.io.Serializable;

public class Credenciales implements Serializable {

    private String url;
    private String puerto;
    private String usuario;
    private String contrasenna;

    public Credenciales(String url, String puerto, String usuario, String contrasenna) {
        this.url = url;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }

    @Override
    public String toString() {
        return url + File.separator + File.separator + puerto + File.separator + usuario + File.separator + contrasenna;
    }
}
