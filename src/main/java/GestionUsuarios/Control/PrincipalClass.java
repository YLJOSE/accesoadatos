package GestionUsuarios.Control;

import SubsistemaGestionUsuarios.ControlBBDD;

import javax.swing.*;

public class PrincipalClass {
    public static void main(String[] args) {
        login();
    }
    public static void login() {

        String id_User, passwd;
        id_User = JOptionPane.showInputDialog("Ingrese el id de usuario:");
        passwd = JOptionPane.showInputDialog("Ingrese la contraseña:");

        ControlBBDD bbdd = new ControlBBDD();
        bbdd.consultaLogin(id_User,passwd);

    }
}
