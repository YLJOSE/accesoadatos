package MongoDBEjercicios.GestorBinario;

import java.io.*;

public class BinaryHelper {

    public static Credentials readCredentials() {

        File file = new File("credencialesMongo.dat");
        Credentials credentials;

        try {
            ObjectInputStream oIs = new ObjectInputStream(new FileInputStream(file));

            credentials = (Credentials) oIs.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return credentials;
    }

    public static void escribirCredenciales() throws IOException {

        File file = new File("credencialesMongo.dat");

        Credentials credentials = new Credentials("mongodb://localhost:27017", "local", "users");


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {

            oos.writeObject(credentials);
        }


    }
}
