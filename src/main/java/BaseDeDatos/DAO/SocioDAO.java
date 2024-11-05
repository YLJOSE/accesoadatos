package BaseDeDatos.DAO;

public class SocioDAO {
    public DTOSocio muestraSocioById(long id) {
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        DTOSocio socio = new DTOSocio();

        return socio;
    }

    public DTOSocio getdNIE() throws NonUniqueRecordEx {
        if (true) {
            throw new NonUniqueRecordEx();
        }

        return new DTOSocio();
    }
}
