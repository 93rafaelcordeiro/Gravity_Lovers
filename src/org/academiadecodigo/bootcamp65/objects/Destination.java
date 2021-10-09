package org.academiadecodigo.bootcamp65.objects;


import org.academiadecodigo.bootcamp65.physics.Vector;

public class Destination extends GameObject {

    public Destination(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    public Destination(Vector position, double width, double height) {
        super(position, width, height);
    }
}
