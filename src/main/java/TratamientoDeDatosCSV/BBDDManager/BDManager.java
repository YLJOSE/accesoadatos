package TratamientoDeDatosCSV.BBDDManager;

import TratamientoDeDatosCSV.Interfaces.Write;
import TratamientoDeDatosCSV.Objects.Coche;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BDManager implements Write {
    private Connection connection;
    private List<Coche> objects;

    public BDManager(List<String> props, List<Coche> objects) {

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
        String update = "insert into memoria values(?,?,?,?,?);";

        for (int i = 0; i < objects.size(); i++) {

            try (PreparedStatement ps = connection.prepareStatement(update)) {
                ps.setInt(1, objects.get(i).getId());
                ps.setString(2, objects.get(i).getMotor());
                ps.setString(3, objects.get(i).getPlaca());
                ps.setString(4, objects.get(i).getDescripcion());
                ps.setString(5, objects.get(i).getAnnoFabricacion());
                ps.executeUpdate();
                System.out.println("Subida de datos a la BBDD correctamente!!");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
