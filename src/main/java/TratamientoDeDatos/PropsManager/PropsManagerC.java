package TratamientoDeDatos.PropsManager;

import TratamientoDeDatos.Interfaces.Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PropsManagerC implements Read {
    protected List<String> credenciales = new ArrayList<>();

    public PropsManagerC() {
    }

    @Override
    public void read() {
    }

    @Override
    public List<String> readProps() {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(new File("C:\\Users\\juanc\\IdeaProjects\\accesoadatos\\datos\\configuracion.properties")));
            credenciales.add(properties.getProperty("user"));
            credenciales.add(properties.getProperty("password"));
            credenciales.add(properties.getProperty("Url"));
            credenciales.add(properties.getProperty("pathFile"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return credenciales;
    }


}
