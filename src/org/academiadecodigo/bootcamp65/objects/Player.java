package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Player extends GameObject {

    private Vector velocity;
    private Vector acceleration;
    private boolean dead;

    private boolean jumping;

    public static final Color DEFAULT_PLAYER_COLOR = new Color(150, 191, 255);

    public Player(double x, double y, double width, double height) {
        super(x, y, width, height);
        this.velocity = new Vector(0, 0);
        this.acceleration = new Vector(0, 0);
        this.setColor(DEFAULT_PLAYER_COLOR);
        this.dead = false;
        this.jumping = false;
    }

    public Player(Vector position, double width, double height) {
        super(position, width, height);
        this.velocity = new Vector(0, 0);
        this.acceleration = new Vector(0, 0);
        this.setColor(DEFAULT_PLAYER_COLOR);
        this.dead = false;
        this.jumping = false;
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

    public boolean isJumping() {
        return jumping;
    }

    public void setJumping(boolean jumping) {
        this.jumping = jumping;
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
        if (this.getPicture() != null) {
            this.getPicture().translate(this.velocity.getX(), this.velocity.getY());
        }
        this.acceleration.setX(0);
        this.acceleration.setY(0);
    }


}
