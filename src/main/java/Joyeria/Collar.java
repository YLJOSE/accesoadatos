package Joyeria;

public class Collar {
    private final int TOTAL_PERLAS = 20;
    private static int count = 0;

    public Collar() {
    }

    public void insertarPerla(int cantidad, String color) throws NoMaterialsLeft{
        count += cantidad;
        if (cantidad == TOTAL_PERLAS) {
            System.out.println("Collar realizado con exito!!!");
        } else if (cantidad < TOTAL_PERLAS) {
            NoMaterialsLeft exception = new NoMaterialsLeft(color);
            System.out.println(exception.getMessage());
        }
    }
}

class NoMaterialsLeft extends Exception {
    public NoMaterialsLeft(String color) {
        super("Se acabaron las perlas de color " + color);
    }
}
