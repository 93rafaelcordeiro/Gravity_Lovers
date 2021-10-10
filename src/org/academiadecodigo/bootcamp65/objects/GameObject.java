package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public abstract class GameObject {

    private Vector position;
    private double width;
    private double height;
    private Rectangle bounds;

    public GameObject(double x, double y, double width, double height) {
        this.position = new Vector(x, y);
        this.width = width;
        this.height = height;
        this.bounds = new Rectangle(x, y, width, height);
    }

    public GameObject(Vector position, double width, double height) {
        this.position = position;
        this.width = width;
        this.height = height;
        this.bounds = new Rectangle(position.getX(), position.getY(), width, height);
    }

    //region Getters and Setters
    public Vector getPosition() {
        return position;
    }

    public void setPosition(Vector position) {
        this.position = position;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }
    //endregion

    public void show() {

    }
}
