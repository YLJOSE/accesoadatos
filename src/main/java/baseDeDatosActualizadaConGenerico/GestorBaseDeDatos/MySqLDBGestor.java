package baseDeDatosActualizadaConGenerico.GestorBaseDeDatos;

import baseDeDatosActualizadaConGenerico.GestorBinario.Credenciales;
import baseDeDatosActualizadaConGenerico.GestorBinario.SoporteBinario;
import baseDeDatosActualizadaConGenerico.Interfaces.CRUD;
import baseDeDatosActualizadaConGenerico.Objetos.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySqLDBGestor implements CRUD<Persona> {
    protected Connection connection;

    public MySqLDBGestor() {

        try {
            Credenciales credenciales = SoporteBinario.leerCredenciales();
            connection = DriverManager.getConnection(credenciales.toString());
            if (connection != null) {
                System.out.println("INFO.conectado exitosamente a MYSQL DB");

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public void insertarUsuario(Persona entidad) {

        String insertar = "insert into(nombre,apellido,edad) memoria values(?,?,?);";

        try (PreparedStatement ps = connection.prepareStatement(insertar)) {
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getApellidos());
            ps.setInt(3, entidad.getEdad());
            ps.executeUpdate();
            System.out.println("Objeto subido a base de datos correctamente");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Persona filtrarPorId(int id) {
        String filtro = "select * from memoria where id=?";

        try (PreparedStatement ps = connection.prepareStatement(filtro)) {
            ps.setInt(1, id);

            ResultSet resultado = ps.executeQuery();

            Persona personaFiltro = new Persona(
                    resultado.getInt("id"),
                    resultado.getString("nombre"),
                    resultado.getString("apellidos"),
                    resultado.getInt("edad"));
            resultado.close();

            return personaFiltro;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Persona> obtenerTodosLosObjetos() {
        String query = "select * from memoria;";
        List<Persona> personas = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {

            ResultSet rst = stmt.executeQuery();

            while (rst.next()) {

                Persona personaFiltro = new Persona(
                        rst.getInt("id"),
                        rst.getString("nombre"),
                        rst.getString("apellidos"),
                        rst.getInt("edad"));
                personas.add(personaFiltro);
            }
            rst.close();
            return personas;

        } catch (SQLException e) {
            e.getErrorCode();
        }

        return null;
    }

    @Override
    public void actualizarPorId(int id, Persona entidad) {
/*
*    UPDATE table_name
SET column_name = value
WHERE condition
* */
        String sentencia = "update memoria set nombre = ?, apellido=?,edad=? where id=?";
        try (PreparedStatement ps = connection.prepareStatement(sentencia)) {
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getApellidos());
            ps.setInt(3, entidad.getEdad());
            ps.setInt(4, id);
            ps.executeUpdate();
            System.out.println("Objeto actualoizado correctamente");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void eliminarPorId(int id) {
        /*
        * DELETE FROM Clientes
WHERE Name = "Pedro";
        * */

        String sentencia ="delete from memoria where id=?";
        try (PreparedStatement ps = connection.prepareStatement(sentencia)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Objeto eliminado correctamente");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
