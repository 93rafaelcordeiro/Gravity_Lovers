package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Barrier extends GameObject {

    private boolean dangerous;
    private boolean destroyable;

    public Barrier(double x, double y, double width, double height) {
        super(x, y, width, height);
        this.setColor(new Color(190,152,214));
        this.dangerous = false;
        destroyable = false;
    }

    public Barrier(Vector position, double width, double height) {
        super(position, width, height);
        this.setColor(new Color(190,152,214));
        dangerous = false;
    }

    public Barrier(double x, double y, double width, double height, boolean dangerous) {
        super(x, y, width, height);
        this.setColor(new Color(190,152,214));
        this.dangerous = dangerous;
    }

    public Barrier(Vector position, double width, double height, boolean dangerous) {
        super(position, width, height);
        this.setColor(new Color(190,152,214));
        this.dangerous = dangerous;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    @Override
    public void show() {
        if (dangerous) {
            setColor(new Color(255, 85, 85));
        }
        super.show();
    }
}
