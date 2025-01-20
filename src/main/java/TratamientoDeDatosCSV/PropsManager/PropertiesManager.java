package TratamientoDeDatosCSV.PropsManager;

import TratamientoDeDatosCSV.Interfaces.Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PropertiesManager implements Read {
    protected List<String> props = new ArrayList<>();

    @Override
    public List<String> read() {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(new File("C:\\Users\\ALUMNO CCC - TARDE\\IdeaProjects\\accesoadatos\\datos\\configuracion.properties")));
            props.add(properties.getProperty("user"));
            props.add(properties.getProperty("password"));
            props.add(properties.getProperty("Url"));
            props.add(properties.getProperty("pathFile"));
            return props;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

