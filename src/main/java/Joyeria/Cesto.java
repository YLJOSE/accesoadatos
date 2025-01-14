package Joyeria;

public class Cesto {
    private final int MAX_BLUE = 20;
    private final int MAX_WHT = 21;
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

    public synchronized void cogerPerla(int color) throws NoMaterialsLeft {

        if (color == 1) {
            contadorBlue++;
        } else if (color == 2) {
            contadorWht++;
        }

        if (MAX_BLUE == contadorBlue && MAX_WHT == contadorWht) {
            this.c = true;
            throw new NoMaterialsLeft("NO HAY MAS PERLAS.... FIN!!");

        }

        if (MAX_WHT == contadorWht) {
            System.out.println("no hay mas perlas blancas");
        }
        if (MAX_BLUE == contadorBlue) {
            System.out.println("no hay mas perlas azules");
            pa = true;
        }

    }

    public boolean isEmpty() {
        return this.c;
    }

    public boolean getFinishPerlasAzules() {
        return this.pa;
    }
}
