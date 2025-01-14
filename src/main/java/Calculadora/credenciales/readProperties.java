package Calculadora.credenciales;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class readProperties {
    public static List<String> read() {
        List<String> credenciales = new ArrayList<>();

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File("C:/Users/ALUMNO CCC - TARDE/IdeaProjects/accesoadatos/src/main/java/Calculadora/credenciales/configuracion.properties")));
            credenciales.add(properties.getProperty("user"));
            credenciales.add(properties.getProperty("password"));
            credenciales.add(properties.getProperty("Url"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return credenciales;
    }
}
