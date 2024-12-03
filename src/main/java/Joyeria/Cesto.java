package Joyeria;

public class Cesto {
    private final int MAX_BLUE = 10;
    private final int MAX_WHT = 10;
    private int contadorBlue = 0;
    private int contadorWht = 0;
private boolean c = false;
    public Cesto() {

    }

    public void cogerPerla(int color) {
        if (MAX_BLUE == contadorBlue) {
            System.out.println("no hay mas perlas azules");
        }
        if (MAX_WHT == contadorWht) {
            System.out.println("no hay mas perlas blancas");
        }
        if (MAX_BLUE == contadorBlue && MAX_WHT == contadorWht) {
            System.out.println("Ya no hay mas perlas");
            new Throwable(new NoMaterialsLeft("Ya no hay mas perlas"));
            c = true;
        } else {
            if (color == 1) {
                contadorBlue++;
            } else {
                contadorWht++;
            }
        }


    }

public boolean getFinish(){
        return this.c;
}
}
