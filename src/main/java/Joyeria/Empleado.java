package Joyeria;

import java.util.ArrayList;

public class Empleado extends Thread {
    ArrayList<Collar> collaresAzules = new ArrayList<Collar>();
    ArrayList<Collar> collaresBlancos = new ArrayList<Collar>();
    private  ArrayList<Collar> collaresMixtos = new ArrayList<Collar>();
    static private Cesto cesto = null; // Es compartido por todos los objetos de la clase
    private Collar collar = new Collar();

    public Empleado(Cesto cesto) {
        if (this.cesto == null)
            this.cesto = cesto;
    }

    @Override
    public void run() {

        do {
            try {
                int num = 1;

                if (this.cesto.getFinishPerlasAzules()) {
                    num = 2;
                }
                System.out.println(num);

                // EL ACCESO A UN RECURSO COMPARTIDO REQUIERE DEL USO DE UNA SECCIÓN CRÍTICA
                this.cesto.cogerPerla(num);
                this.collar.insertarPerla(num);
                if (collar.isCompleted()) {
                    this.collaresMixtos.add(collar);
                    try {
                        Thread.sleep(5000);
                        this.collar = new Collar();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + this.cesto.getContadorBlue() + " " + this.cesto.getContadorWht());
            } catch (NoMaterialsLeft ex) {
                System.out.println("NO HAY MÁS PERLAS. FIN!!!");
                System.out.println("Soy.. " + this.getName().toString() + " y hice " + collaresMixtos.size() + " collar");
                System.exit(0);
            }
        } while (!this.cesto.isEmpty());


    }
}


