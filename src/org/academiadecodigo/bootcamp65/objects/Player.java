package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Player extends GameObject {

    private Vector velocity;
    private Vector acceleration;
    private boolean dead;

    public Player(double x, double y, double width, double height) {
        super(x, y, width, height);
        this.velocity = new Vector(0, 0);
        this.acceleration = new Vector(0, 0);
        this.setColor(new Color(150, 191, 255));
        this.dead = false;
    }

    public Player(Vector position, double width, double height) {
        super(position, width, height);
        this.velocity = new Vector(0, 0);
        this.acceleration = new Vector(0, 0);
        this.setColor(new Color(150, 191, 255));
        this.dead = false;
    }

    //region Getters and Setters and Adders
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

    public void addAcceleration(Vector vector) {
        this.acceleration.setX(this.acceleration.getX() + vector.getX());
        this.acceleration.setY(this.acceleration.getY() + vector.getY());
    }

    public void addVelocity(Vector vector) {
        this.velocity.setX(this.velocity.getX() + vector.getX());
        this.velocity.setY(this.velocity.getY() + vector.getY());
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    //endregion

    public void update(Vector velocity) {
        if (velocity == null) {
            return;
        }
        this.velocity = velocity;
        this.getPosition().add(this.velocity);
        this.getBoundary().setPosition(this.getPosition());
        this.getRectangle().translate(this.velocity.getX(), this.velocity.getY());
        this.acceleration.setX(0);
        this.acceleration.setY(0);
    }


}
