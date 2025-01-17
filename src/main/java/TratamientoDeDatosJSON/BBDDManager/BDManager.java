package TratamientoDeDatosJSON.BBDDManager;

import TratamientoDeDatosJSON.Interfaces.Write;
import TratamientoDeDatosJSON.Objects.Person;

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
        String update = "insert into memoria values(?,?,?,?);";
        for (int i = 0; i < objects.size(); i++) {

            try (PreparedStatement ps = connection.prepareStatement(update)) {
                ps.setInt(1, objects.get(i).getId());
                ps.setString(2, objects.get(i).getName());
                ps.setString(3, objects.get(i).getLastName());
                ps.setString(4, objects.get(i).getAge());
                ps.executeUpdate();
                System.out.println("Subida de datos a la BBDD correctamente!!");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
