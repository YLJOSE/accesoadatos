package SubsistemaGestionUsuarios;

import javax.swing.*;

public class InterfaceGrap {

    public static void main(String[] args) {
        String id_USER;
       id_USER =  JOptionPane.showInputDialog("Ingrese el id de usuario:");
       if(id_USER.isBlank()){
        main(args);
       }

    }
}
