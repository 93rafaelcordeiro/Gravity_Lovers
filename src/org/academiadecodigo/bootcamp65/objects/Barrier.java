package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.physics.Vector;

public class Barrier extends GameObject {

    public Barrier(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    public Barrier(Vector position, double width, double height) {
        super(position, width, height);
    }

}
