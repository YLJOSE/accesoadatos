package ExamenRecuperacionJuanJo.Ejercicio5.GestorBBDD;

import ExamenRecuperacionJuanJo.Ejercicio1.Interfaces.Leer;
import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.Empresa;
import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.Persona;

import java.sql.*;
import java.util.List;

public class BBDDGestor implements Leer {
    private Connection connection;
    private List<Persona> subOrdinados;

    public BBDDGestor(List<String> props) {

        try {
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
    public Empresa leer() {
        return null;
    }

//    @Override
//    public List<Persona> leer() {
//        String sentencia = "select * from  subOrdinados;";
//
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(sentencia);
//            ResultSet rs = preparedStatement.executeQuery();
//            while (rs.next()) {
//              //  Persona persona = new Persona(rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), null);
////                System.out.println("Nombre: " + rs.getObject(1));
////                System.out.println("apellidos: " + rs.getObject(2));
////                System.out.println("edad: " + rs.getObject(3));
////                System.out.println("fechaingreso: " + rs.getObject(4));
////                System.out.println("salario bruto: " + rs.getObject(5));
////
//            //    subOrdinados.add(persona);
//            }
//            return subOrdinados;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
}
