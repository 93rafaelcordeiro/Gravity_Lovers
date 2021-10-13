package org.academiadecodigo.bootcamp65.physics;

public class Boundary {

    private Vector position;
    private double width;
    private double height;

    public Boundary() {
        this.position = new Vector(Math.random() * 100, Math.random() * 100);
        this.width = Math.random() * 50;
        this.height = Math.random() * 200;
    }

    public Boundary(double x, double y, double width, double height) {
        this.position = new Vector(x, y);
        this.width = width;
        this.height = height;
    }

    public Boundary(Vector position, double width, double height) {
        this.position = position;
        this.width = width;
        this.height = height;
    }

    public Boundary(Boundary boundary) {
        this.position = new Vector(boundary.getPosition());
        this.width = boundary.getWidth();
        this.height = boundary.getHeight();
    }

    //region Getters and Setters
    public Vector getPosition() {
        return position;
    }

    public void setPosition(Vector position) {
        this.position.setX(position.getX());
        this.position.setY(position.getY());
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
    //endregion

    //region Collision Control
    public boolean contains(Boundary boundary) {
        return !(this.position.getX() > boundary.getPosition().getX() + boundary.getWidth() ||
                this.position.getY() > boundary.getPosition().getY() + boundary.getHeight() ||
                this.position.getX() + this.width < boundary.getPosition().getX() ||
                this.position.getY() + this.height < boundary.getPosition().getY());
    }





    //endregion
}
