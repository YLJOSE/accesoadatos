package SubsistemaGestionUsuarios;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static SubsistemaGestionUsuarios.UserMetodos.getHash;
import static SubsistemaGestionUsuarios.controlAdmin.menuAdmin;
import static SubsistemaGestionUsuarios.controlAdmin.menuUsuarioConsulta;
import static java.lang.Thread.sleep;

public class ControlBBDD {
    private int port = 3307;
    private final String USER = "root";
    private final String PASSWORD = "";
    private Connection connection;

    public ControlBBDD() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:" + port + "/gestionUsuarios", USER, PASSWORD);
            if (connection != null) {
                System.out.println("INFO. Successfully connected to MYSQL DB");

            }
        } catch (SQLException e) {
            e.getErrorCode();
        }

    }


    public void consultaLogin(String user_id, String password) {
        String verificarUsuario;
        boolean isActive;
        int id;
        try {
            if (connection != null) {
                String query = "select * from User where id_usuario = ? and contrasenna =?";
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.setString(1, user_id);
                stmt.setString(2, getHash(password));

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
                LocalDateTime ld = LocalDateTime.now();

                ResultSet rst = stmt.executeQuery();

                if (rst.next()) {
                    do {
                        id = rst.getInt("id");
                        isActive = (Boolean) rst.getBoolean("activo");
                        verificarUsuario = String.valueOf(rst.getObject("tipoUser"));

                        if (isActive) {
                            updateFechaCorrecta(String.valueOf(ld.format(dtf)), id);
                            if (verificarUsuario.equals("Admin")) {
                                menuAdmin(this);
                            } else {
                                menuUsuarioConsulta(this);
                            }

                        }
                    } while (rst.next());
                } else {
                    updateFechaIncorrect(String.valueOf(ld.format(dtf)), verId(user_id));
                    System.err.println("............INFO............");
                    try {
                        sleep(3000);
                        System.err.println("........ERROR AL LOGIN .....");
                        sleep(3000);
                        System.err.println("......Revisa contraseña.....");
                        System.err.println("............................");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                rst.close();
                stmt.close();
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
    }

    public void verUsuarios() {
        try {
            if (connection != null) {
                String query = "select * from User;";
                PreparedStatement stmt = connection.prepareStatement(query);

                ResultSet rst = stmt.executeQuery();
                while (rst.next()) {
                    System.out.println("Id: " + rst.getObject("id") + "\nId_Usuario: " + rst.getObject("id_usuario") + "\nContraseña: " + rst.getObject("contrasenna") + "\nFecha ultimo acceso correcto: " + rst.getObject("horaFecha_ultAcCorrect") + "\nFecha ultimo acceso Erroneo: " + rst.getObject("horaFecha_ultAcErr") + "\nTipo de usuario: " + rst.getObject("tipoUser") + "\nActivo: " + rst.getObject("activo"));
                    System.out.println("...........................");
                }
                rst.close();
                stmt.close();
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
    }

    public void addUser(User user) {
        try {
            if (connection != null) {
                String query = "insert into User(id_usuario,contrasenna,tipoUser) values(" + "'" + user.getId_user() + "','" + user.getPassword() + "','" + user.getTypeUser() + "');";
                System.out.println(query);
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.executeUpdate();
                stmt.close();
            }
        } catch (SQLException e) {
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

    public void updateFechaCorrecta(String fecha, int id) {
        try {
            if (connection != null) {
                String query = "update gestionusuarios.User set horaFecha_ultAcCorrect ='" + fecha + "' where id ='" + id + "';";
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.executeUpdate();
                stmt.close();
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
    }

    public void updateFechaIncorrect(String fecha, int id) {
        try {
            if (connection != null) {
                String query = "update gestionusuarios.User set horaFecha_ultAcErr ='" + fecha + "' where id ='" + id + "';";
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.executeUpdate();
                stmt.close();
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
    }

    public int verId(String user_id) {
        int id;
        try {
            if (connection != null) {
                String query = "select * from User where id_usuario =?;";
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.setString(1, user_id);
                ResultSet rst = stmt.executeQuery();
                while (rst.next()) {
                    return id = rst.getInt("id");
                }
                rst.close();
                stmt.close();
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
        return 0;
    }
}
