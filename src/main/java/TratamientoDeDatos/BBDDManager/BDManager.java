package TratamientoDeDatos.BBDDManager;

import Calculadora.credenciales.readProperties;
import TratamientoDeDatos.Interfaces.Write;
import TratamientoDeDatos.Objects.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BDManager implements Write {
    private Connection connection;
    private List<Person> objects;

    public BDManager(List<String> props, List<Person> objects) {

        try {
            this.objects = objects;
            connection = DriverManager.getConnection(props.get(2), props.get(0), props.get(1));

            if (connection != null) {
                System.out.println("INFO. Successfully connected to MYSQL DB");
                props.clear();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write() {
        try (PreparedStatement ps = connection.prepareStatement("")) {
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
