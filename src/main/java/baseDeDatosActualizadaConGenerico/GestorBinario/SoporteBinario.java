package baseDeDatosActualizadaConGenerico.GestorBinario;

import MongoDBEjercicios.GestorBinario.Credentials;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SoporteBinario {
    public static Credenciales leerCredenciales() {

        File file = new File("credencialesMySqL.dat");
        Credenciales credentials;

        try {
            ObjectInputStream oIs = new ObjectInputStream(new FileInputStream(file));

            credentials = (Credenciales) oIs.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return credentials;
    }
}
