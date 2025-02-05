package ExamenRecuperacionJuanJo.Ejercicio1.CRUD;

import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.Empresa;
import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.MandoIntermedio;
import ExamenRecuperacionJuanJo.Ejercicio1.OBjetos.Persona;

import java.util.ArrayList;
import java.util.List;

public class GestorCRUD {
    private List<Persona> sub;
    private List<MandoIntermedio> mandos;

    public GestorCRUD(Empresa empresa) {
        this.sub = empresa.getSubordinados();
        this.mandos = empresa.getMandoIntermedio();
    }

    public void annadirPersonal(Persona subordinado) {
        sub.add(subordinado);
        System.out.println("Subordinado añadido correctamente!!");
    }

    public void borrarPersonal(String nombre) {
        // for (int i = 0; <condicion_de_continuidad>; i++)
        for (Persona p : sub) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                sub.remove(p);
                System.out.println("Personal eliminado correctamente ");
                return;
            }
        }
        for (MandoIntermedio m : mandos) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                mandos.remove(m);
                System.out.println("Personal eliminado correctamente ");
                return;
            }
        }


    }

    public void actualizarPersonal(String nombre, String fechaIncorporacion) {
        for (Persona p : sub) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                p.setFechaIngresoEmpresa(fechaIncorporacion);
                System.out.println("Dato actualizado! ");
                return;
            }
        }
        for (MandoIntermedio m : mandos) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                m.setFechaIngresoEmpresa(fechaIncorporacion);
                System.out.println("Dato actualizado");
                return;
            }
        }


    }

    public void listarPersonalCompleta() {
        for (Persona p : sub) {
            System.out.println(p);
        }
        for (MandoIntermedio m : mandos) {
            System.out.println(m);
        }


    }
}
