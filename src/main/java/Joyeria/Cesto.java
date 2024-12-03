package Joyeria;

public class Cesto {
    private final int MAX_BLUE = 10;
    private final int MAX_WHT = 10;
    private int contadorBlue = 0;
    private int contadorWht = 0;
    private boolean c = false;
    private boolean pa = false;

    public int getContadorBlue() {
        return this.contadorBlue;
    }

    public int getContadorWht() {
        return this.contadorWht;
    }

    public Cesto() {

    }

    public void cogerPerla(int color) throws NoMaterialsLeft {

        if (color == 1) {
            contadorBlue++;
        } else if (color == 2) {
            contadorWht++;
        }

        if (MAX_BLUE == contadorBlue && MAX_WHT == contadorWht) {
            System.out.println("Ya no hay mas perlas");
            this.c = true;
            throw new NoMaterialsLeft("Ya no hay mas perlas");

        }

        if (MAX_WHT == contadorWht) {
            System.out.println("no hay mas perlas blancas");
        }
        if (MAX_BLUE == contadorBlue) {
            System.out.println("no hay mas perlas azules");
            pa = true;
        }

    }

    public boolean getFinish() {
        return this.c;
    }

    public boolean getFinishPerlasAzules() {
        return this.pa;
    }
}
