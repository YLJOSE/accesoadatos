package SubsistemaGestionUsuarios;

public class Login {

    public Login(long id_user, String password) {
        ControlBBDD bbdd = new ControlBBDD();

        bbdd.muestraSocioById(id_user, password);



    }
}
