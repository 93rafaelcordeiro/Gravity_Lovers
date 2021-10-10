package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.physics.Vector;

public class Player extends GameObject {

    private Vector velocity;
    private Vector acceleration;

    public Player(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    public Player(Vector position, double width, double height) {
        super(position, width, height);
    }

    //region Getters and Setters

    public Vector getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector velocity) {
        this.velocity = velocity;
    }

    public Vector getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Vector acceleration) {
        this.acceleration = acceleration;
    }

    //endregion

    public void update() {
        this.velocity.add(this.acceleration);
        this.getPosition().add(this.velocity);
    }
}
