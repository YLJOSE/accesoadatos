package hilos;

public class Jugador extends Thread{
    String name ;

    Jugador(String name){
        this.name = name;
    }

    @Override
    public void run() {

        this.jugar();

    }

    public synchronized void jugar(){
        System.out.println(this.name);

    }
}

 class ayuda{
     public static void main(String[] args) {
         Jugador d = new Jugador("Ping");
         Jugador f = new Jugador("Pong");





         while(true){
             d.run();
             f.run();

         }
     }
}
