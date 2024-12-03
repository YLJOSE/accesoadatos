package Joyeria;

import java.util.ArrayList;
import java.util.List;

public class Collar {

    private boolean collarFinish;
    private List<Perla> o = new ArrayList<>();

    public Collar() {
    }

    public void insertarPerla(int color) {

            if (color == 1) {
                o.add(new Perla("Blue"));
            } else {
                o.add(new Perla("white"));
            }
            if(o.size() == 20){
                this.collarFinish = true;

            }

    }
    public boolean terminoCollar(){
        return this.collarFinish;
    }

}

