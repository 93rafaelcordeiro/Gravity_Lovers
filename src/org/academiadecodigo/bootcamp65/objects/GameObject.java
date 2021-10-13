package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.physics.Boundary;
import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public abstract class GameObject {

    private Vector position;
    private double width;
    private double height;
    private Boundary boundary;
    private Rectangle rectangle;

    public GameObject(double x, double y, double width, double height) {
        this.position = new Vector(x, y);
        this.width = width;
        this.height = height;
        this.boundary = new Boundary(x, y, width, height);
        this.rectangle = new Rectangle(x, y, width, height);
    }

    public GameObject(Vector position, double width, double height) {
        this.position = new Vector(position.getX(), position.getY());
        this.width = width;
        this.height = height;
        this.boundary = new Boundary(position.getX(), position.getY(), width, height);
        this.rectangle = new Rectangle(position.getX(), position.getY(), width, height);
    }

    //region Getters and Setters
    public Vector getPosition() {
        return position;
    }

    public void setPosition(Vector position) {
        Vector displacement = new Vector(position);
        displacement.sub(this.position);
        this.position.setX(position.getX());
        this.position.setY(position.getY());
        this.boundary.setPosition(position);
        this.rectangle.translate(displacement.getX(), displacement.getY());
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

    public Boundary getBoundary() {
        return boundary;
    }

    public void setBoundary(Boundary boundary) {
        this.boundary = boundary;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void setColor(Color color) {
        this.rectangle.setColor(color);
    }

    public Color getColor() {
        return this.rectangle.getColor();
    }

    //endregion

    public void show() {
        this.rectangle.fill();
    }
}
