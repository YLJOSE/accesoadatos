package Joyeria;

import java.util.ArrayList;
import java.util.List;

public class Collar {
    private List<Perla> perlas;

    public Collar() {
        this.perlas = new ArrayList<>();
    }

    public synchronized void insertarPerla(Perla perla) {
        if (perlas.size() < 20) {
            perlas.add(perla);
        }
    }

    public boolean isComplete() {
        return perlas.size() == 20;
    }

    public List<Perla> getPerlas() {
        return perlas;
    }
}

class NoMaterialsLeft extends Exception {
    public NoMaterialsLeft(String color) {
        super(color);
    }
}
