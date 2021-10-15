package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Block extends GameObject {

    private boolean dangerous;
    private boolean destroyed;

    public Block(double x, double y, double width, double height) {
        super(x, y, width, height);
        this.setColor(new Color(190,152,214));
        this.dangerous = false;
        this.destroyed = false;
    }

    public Block(Vector position, double width, double height) {
        super(position, width, height);
        this.setColor(new Color(190,152,214));
        this.dangerous = false;
        this.destroyed = false;
    }

    public Block(double x, double y, double width, double height, boolean dangerous) {
        super(x, y, width, height);
        this.setColor(new Color(190,152,214));
        this.dangerous = dangerous;
        this.destroyed = false;
    }

    public Block(double x, double y, double width, double height, boolean dangerous, boolean destroyable) {
        super(x, y, width, height);
        this.setColor(new Color(190,152,214));
        this.dangerous = dangerous;
        this.destroyed = destroyable;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

}
