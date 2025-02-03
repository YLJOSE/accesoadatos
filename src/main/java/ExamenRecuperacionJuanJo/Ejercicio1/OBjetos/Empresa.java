package ExamenRecuperacionJuanJo.Ejercicio1.OBjetos;

import java.util.List;

public class Empresa {

    private List<Persona> subordinados;
    private List<MandoIntermedio> mandoIntermedio;

    public Empresa(List<Persona> subordinados, List<MandoIntermedio> mandoIntermedio) {
        this.subordinados = subordinados;
        this.mandoIntermedio = mandoIntermedio;
    }

    public List<Persona> getSubordinados() {
        return subordinados;
    }

    public List<MandoIntermedio> getMandoIntermedio() {
        return mandoIntermedio;
    }
}
