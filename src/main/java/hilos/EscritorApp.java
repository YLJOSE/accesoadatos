package hilos;

public class EscritorApp {

    public static void main(String[] args) {
        Escritor e1 = new Escritor();
        Escritor e2 = new Escritor();
        e1.setName("Hilo uno");
        e2.setName("Hilo Dos");
        e1.run();
        try {
            Thread.sleep(2000);
            System.out.println("..............");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        e2.run();

    }
}