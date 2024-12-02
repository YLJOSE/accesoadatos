package Joyeria;

public class Cesto {
    private int bluePerlas;
    private int whitePerlas;

    public Cesto(int bluePerlas, int whitePerlas) {
        this.bluePerlas = bluePerlas;
        this.whitePerlas = whitePerlas;
    }

    public synchronized Perla cogerPerla(int color) throws NoMaterialsLeft {
        if (color == 1 && bluePerlas > 0) {
            bluePerlas--;
            return new Perla("Azul");
        } else if (color == 2 && whitePerlas > 0) {
            whitePerlas--;
            return new Perla("Blanca");
        } else {
            throw new NoMaterialsLeft("Se acabaron las perlas de color " + (color == 1 ? "Azul" : "Blanca"));
        }
    }

    public boolean isMaterialsLeft() {
        return bluePerlas > 0 || whitePerlas > 0;
    }
}