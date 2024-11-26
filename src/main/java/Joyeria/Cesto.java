package Joyeria;

public class Cesto {
    private final int MAX_BLUE = 210;
    private final int MAX_WHT = 180;
    private static int countBlue = 0;
    private static int countWht = 0;
    private boolean isMaterialsLeft = true;

    public Cesto() {
    }

    public void cogerPerla(int count, String color) {

        if (countBlue == MAX_BLUE || countWht == MAX_WHT) {
            System.err.println("Ya no hay mas perlas de color" + color);
            isMaterialsLeft = false;
        } else {
            if (color.equalsIgnoreCase("Blue")) {
                countBlue += count;
            } else {
                countWht += count;
            }
        }
    }

    public boolean isMaterialsLeft() {
        return isMaterialsLeft;
    }
}