package SubsistemaGestionUsuarios;

import javax.swing.*;

import static SubsistemaGestionUsuarios.UserMetodos.getHash;

public class Control {
    public static void main(String[] args) {
     login();
    }
    public static void login() {

        String id_User, passwd;
        id_User = JOptionPane.showInputDialog("Ingrese el id de usuario:");
        passwd = JOptionPane.showInputDialog("Ingrese la contraseña:");

        ControlBBDD bbdd = new ControlBBDD();
        bbdd.muestraSocioById(id_User,passwd);

        String a = getHash(passwd);
        System.out.println(a);

    }
}
