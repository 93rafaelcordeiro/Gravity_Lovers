package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.physics.Vector;

public class Player extends GameObject {

    public Player(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    public Player(Vector position, double width, double height) {
        super(position, width, height);
    }
}
