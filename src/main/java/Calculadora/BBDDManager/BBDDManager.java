package Calculadora.BBDDManager;

import Calculadora.credenciales.readProperties;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BBDDManager {
    protected Connection connection = null;

    public BBDDManager() {
        try {
            List<String> props = readProperties.read();
            connection = DriverManager.getConnection(props.get(2), props.get(0), props.get(1));

            if (connection != null) {
                System.out.println("INFO. Successfully connected to MYSQL DB");
                props.clear();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateBBDD(double num, String operation) {
        String numero = String.valueOf(num);
        PreparedStatement ps = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld.format(dtf));
        String update = "Insert into memoria (numero,fechaOperacion) values('" + num + "','" + ld.format(dtf) + "')";

        try {
            ps = connection.prepareStatement(update);
            ps.executeUpdate();
            ps.close();
            closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public double QueryNumber() {
        double number = 0;
        String query = "select numero from gestionoperaciones.memoria;";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ResultSet rst = ps.executeQuery();
            while (rst.next()) {
                number = (double) rst.getObject("numero");

            }

            ps.close();
            rst.close();
            closeConnection();

        } catch (SQLException e) {
            System.err.println("ERROR al leer la base de datos");
        }

        return number;
    }
}
