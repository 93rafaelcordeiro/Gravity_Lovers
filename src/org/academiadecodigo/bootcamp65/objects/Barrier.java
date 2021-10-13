package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Barrier extends GameObject {

    private boolean dangerous;

    public Barrier(double x, double y, double width, double height) {
        super(x, y, width, height);
        dangerous = false;
    }

    public Barrier(Vector position, double width, double height) {
        super(position, width, height);
        dangerous = false;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }


    public void show() {
        if (dangerous) {
            getRectangle().setColor(new Color(255, 85, 85));
        }
        getRectangle().fill();
    }
}
