package ExamenRecuperacionJuanJo.Ejercicio3.GestorPropiedades;

import ExamenRecuperacionJuanJo.Ejercicio3.Interfaces.Leer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PropsGestor implements Leer {
    protected List<String> props = new ArrayList<>();

    @Override
    public List<String> leer() {
        Properties properties = new Properties();

        try {
            // al iniciar revisar poner la ruta que tienes
            properties.load(new FileInputStream(new File("C:\\Users\\ALUMNO CCC - TARDE\\IdeaProjects\\accesoadatos\\src\\main\\java\\ExamenRecuperacionJuanJo\\Ejercicio3\\Ficheros\\data.properties")));
            props.add(properties.getProperty("user"));
            props.add(properties.getProperty("password"));
            props.add(properties.getProperty("Url"));
            return props;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
