package EjerciciosRecuperacion.EjercicioUno.Objetos;

import java.util.ArrayList;
import java.util.List;


public class Empresa {


        private List<Persona> subordinados;
        private List<MandosIntermedios> mandosIntermedios;

    public Empresa(List<Persona> subordinados, List<MandosIntermedios> mandosIntermedios) {
        this.subordinados = subordinados;
        this.mandosIntermedios = mandosIntermedios;
    }

    // Getters y setters
        public List<Persona> getSubordinados() {
            return subordinados;
        }

        public void setSubordinados(List<Persona> subordinados) {
            this.subordinados = subordinados;
        }

        public List<MandosIntermedios> getMandosIntermedios() {
            return mandosIntermedios;
        }

        public void setMandosIntermedios(List<MandosIntermedios> mandosIntermedios) {
            this.mandosIntermedios = mandosIntermedios;
        }
    }



