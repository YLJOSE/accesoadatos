package BaseDeDatos;

//import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.*;

public class ConsultasSQL {
    public static void main(String[] args) {
        ConsultasSQL c = new ConsultasSQL();

    }
    private int port = 3306;
    private final String USER = "root";
    private final String PASSWORD = "";
    private Connection connection;

    public ConsultasSQL() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:" + port + "/club_socios", USER, PASSWORD);
            if (connection != null) {
                System.out.println("INFO. Successfully connected to MYSQL DB");
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
    }

    public  void muestraSocioById(long socio_id){
        try {
            if (connection != null) {
                String query = "select * from socios where id_socio = ?";
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.setLong(1,socio_id);
                System.out.println("CONSULTA =====> "  + stmt.toString() + "\n=========================");
                ResultSet rst = stmt.executeQuery();
                while(rst.next()){
                    System.out.println("Nombre: " + rst.getObject("nombre") +
                            "\nApellido: " + rst.getObject("apellidos") +
                            "\nDNI: " + rst.getObject("dni"));
                }
                rst.close();
                stmt.close();
            }
        }catch(SQLException e){
            e.getErrorCode();
        }
    }
    public void closeConection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.getErrorCode();
        }
    }
}
