package ExamenRecuperacionJuanJo.Ejercicio3.GestorBBDD;

import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.Persona;
import ExamenRecuperacionJuanJo.Ejercicio2.Interfaces.Escribir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BBDDGestor implements Escribir {
    private Connection connection;
    private List<Persona> subOrdinados;
    private List<Persona> mandoIntermedio;

    public BBDDGestor(List<String> props, List<Persona> subOrdinados, List<Persona> mandoOIntermedio) {

        try {
            this.subOrdinados = subOrdinados;
            this.mandoIntermedio = mandoOIntermedio;
            connection = DriverManager.getConnection(props.get(2), props.get(0), props.get(1));

            if (connection != null) {
                System.out.println("INFO: Cone3ccion a base de datos exitosa!!");
                props.clear();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void escribir() {
        String sentenciaSubOrdinados = "insert into subOrdinados (nombre,apellidos,edad,fechaINgresoEmpresa,salarioBrutoAnual) values(?,?,?,?,?);";
        String sentenciaMandoIntermedio = "insert into mandoIntermedio (nombre,apellidos,edad,fechaINgresoEmpresa,salarioBrutoAnual,comision) values(?,?,?,?,?,?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sentenciaSubOrdinados);
            for (int i = 0; i < subOrdinados.size(); i++) {
                preparedStatement.setString(1, subOrdinados.get(i).getNombre());
                preparedStatement.setString(2, subOrdinados.get(i).getApellidos());
                preparedStatement.setInt(3, subOrdinados.get(i).getEdad());
                preparedStatement.setString(4, subOrdinados.get(i).getFechaIngresoEmpresa());
                preparedStatement.setString(5, subOrdinados.get(i).getSalarioBrutoAnual());
                preparedStatement.executeUpdate();
            }
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement ps2 = connection.prepareStatement(sentenciaMandoIntermedio);
            for (int i = 0; i < mandoIntermedio.size(); i++) {
                ps2.setString(1, subOrdinados.get(i).getNombre());
                ps2.setString(2, subOrdinados.get(i).getApellidos());
                ps2.setInt(3, subOrdinados.get(i).getEdad());
                ps2.setString(4, subOrdinados.get(i).getFechaIngresoEmpresa());
                ps2.setString(5, subOrdinados.get(i).getSalarioBrutoAnual());
             //   ps2.setString(5, subOrdinados.get(i).getComision());
                ps2.executeUpdate();
            }
            ps2.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
