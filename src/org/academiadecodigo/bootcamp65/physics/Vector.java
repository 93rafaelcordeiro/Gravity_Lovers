package org.academiadecodigo.bootcamp65.physics;

public class Vector {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector(Vector vector) {
        this.x = vector.getX();
        this.y = vector.getY();
    }

    //region Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    //endregion

    //region Vector Math
    public void add(Vector vector) {
        this.x += vector.getX();
        this.y += vector.getY();
    }

    public void sub(Vector vector) {
        this.x -= vector.getX();
        this.y -= vector.getY();
    }
    //endregion


    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }
}
