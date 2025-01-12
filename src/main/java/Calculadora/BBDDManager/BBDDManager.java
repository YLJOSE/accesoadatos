package Calculadora.BBDDManager;

import java.sql.*;

public class BBDDManager {
    protected String user = "root";
    protected String password = "";
    protected int port = 3307;
    protected Connection connection;

    public BBDDManager() {
        if (connection != null) {
            try {
                connection = DriverManager.getConnection("ruta" + port + user + password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateBBDD(double num) {
        String numero = String.valueOf(num);

        PreparedStatement ps = null;
        try {
            ps.executeUpdate("");
            ps.close();
            closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public double QueryNumber() {
        double number = 0;
        PreparedStatement ps = null;
        try {
            ps.executeQuery("");
            ResultSet rs = null;

            number = 1;
            ps.close();
            rs.close();
            closeConnection();

        } catch (SQLException e) {

        }
        return number;
    }
    public void updateDate(String date){
        PreparedStatement ps= null;
        try {
            ps.executeUpdate(date);
            ps.close();
            closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
