package SubsistemaGestionUsuarios;

import javax.swing.*;

public class Control {
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
/*************Admin*****************
 * ******id_usuario = 123 **********
 * ******contrasenna = pepe17 ******
 * *********************************
 * ********usuario_consulta*********
 * ******id_usuario = 12pepe *******
 * ******contrasenna = pepe04 ******
 * *********************************
 **/