package SubsistemaGestionUsuarios;

import javax.swing.*;

public class InterfaceGrap {



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

    // metodo para obtener el hash MD5
    public static String getHash(String txt) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
