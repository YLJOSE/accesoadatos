package EjercicioCompleto.BBDDManager;

import EjercicioCompleto.Interfaces.Leer;

import java.sql.*;
import java.util.List;
import java.util.Objects;

public class BDManager implements Leer {
    private Connection connection;

    public BDManager(List<String> props) {

        try {
            connection = DriverManager.getConnection(props.get(2), props.get(0), props.get(1));
            if (connection != null) {
                System.out.println("coneccion a base de datos correcta!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Object> leer() {
        String query = "Select * from usuarios;";


        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                //resultSet.getInt();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return List.of();
    }
    //

}
