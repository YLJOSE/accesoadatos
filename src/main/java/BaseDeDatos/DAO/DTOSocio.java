package BaseDeDatos.DAO;

import java.util.Arrays;

public class DTOSocio {
    private long id;
    private String name;
    private String lastName;
    private String dNIE;
    private String domicilio;
    private String localidad;
    private char tipo;
    private String fechaAlta;
    private String fehcaBaja;
    private char pagaUltRecibo;
    private byte[] anotaciones;

    public DTOSocio(long id, String name, String lastName, String dNIE, String domicilio, String localidad, char tipo, String fechaAlta, String fehcaBaja, char pagaUltRecibo, byte[] anotaciones) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dNIE = dNIE;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.tipo = tipo;
        this.fechaAlta = fechaAlta;
        this.fehcaBaja = fehcaBaja;
        this.pagaUltRecibo = pagaUltRecibo;
        this.anotaciones = anotaciones;
    }

    public DTOSocio() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getdNIE() {
        return dNIE;
    }

    public void setdNIE(String dNIE) {
        this.dNIE = dNIE;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFehcaBaja() {
        return fehcaBaja;
    }

    public void setFehcaBaja(String fehcaBaja) {
        this.fehcaBaja = fehcaBaja;
    }

    public char getPagaUltRecibo() {
        return pagaUltRecibo;
    }

    public void setPagaUltRecibo(char pagaUltRecibo) {
        this.pagaUltRecibo = pagaUltRecibo;
    }

    public byte[] getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(byte[] anotaciones) {
        this.anotaciones = anotaciones;
    }

    @Override
    public String toString() {
        return "id:" + id + ", name:'" + name + '\'' + ", lastName='" + lastName + '\'' + ", dNIE='" + dNIE + '\'' + ", domicilio='" + domicilio + '\'' + ", localidad='" + localidad + '\'' + ", tipo=" + tipo + ", fechaAlta='" + fechaAlta + '\'' + ", fehcaBaja='" + fehcaBaja + '\'' + ", pagaUltRecibo=" + pagaUltRecibo + ", anotaciones=" + Arrays.toString(anotaciones) + '}';
    }
}
