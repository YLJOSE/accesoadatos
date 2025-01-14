package BaseDeDatosSegundoTrimestre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BBDDManager {
    private int puerto = 3307;
    private String user = "root";
    private String password = "";
    private Connection connection;

    public BBDDManager() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:" + puerto + "/club_socios", user, password);
            if (connection != null) {

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeConection() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error al cerrar la base de datos");
        }
    }
}
