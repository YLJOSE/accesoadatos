package SubsistemaGestionUsuarios;

import javax.swing.*;
import java.util.Scanner;

public class UserMetodos {

    public static void altaUsuario() {
        Scanner sc = new Scanner(System.in);
        String id_Usuario, passwd, tipoUsuario;
        String passwrdHash;
        ControlBBDD bbdd = new ControlBBDD();
        /**************************************/
        System.out.println("Ingrese el id del usuario:");
        id_Usuario = sc.nextLine();
        System.out.println("Ingrese la contraseña:");
        passwd = sc.nextLine();
        System.out.println("Ingresa el tipo de usuario:");
        tipoUsuario = sc.nextLine();

        passwrdHash = getHash(passwd);
        /************************/
        bbdd.addUser(id_Usuario, passwrdHash, tipoUsuario);


    }

    public static void verUsuarios() {

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
