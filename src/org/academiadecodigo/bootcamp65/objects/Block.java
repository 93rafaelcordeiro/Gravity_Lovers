package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Block extends GameObject {

    private boolean dangerous;
    private boolean destroyable;
    private boolean destroyed;

    public static final Color DEFAULT_BLOCK_COLOR = new Color(255,164,234);

    public Block(double x, double y, double width, double height) {
        super(x, y, width, height);
        this.setColor(DEFAULT_BLOCK_COLOR);
        this.dangerous = false;
        this.destroyable = false;
    }

    public Block(Vector position, double width, double height) {
        super(position, width, height);
        this.setColor(DEFAULT_BLOCK_COLOR);
        this.dangerous = false;
        this.destroyable = false;
    }

    public Block(double x, double y, double width, double height, boolean dangerous) {
        super(x, y, width, height);
        this.setColor(DEFAULT_BLOCK_COLOR);
        this.dangerous = dangerous;
        this.destroyable = false;
    }

    public Block(double x, double y, double width, double height, boolean dangerous, boolean destroyable) {
        super(x, y, width, height);
        this.setColor(DEFAULT_BLOCK_COLOR);
        this.dangerous = dangerous;
        this.destroyable = destroyable;
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
