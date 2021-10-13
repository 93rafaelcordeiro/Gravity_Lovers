package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.levels.Level;
import org.academiadecodigo.bootcamp65.physics.Boundary;
import org.academiadecodigo.bootcamp65.physics.Vector;

public class Player extends GameObject {

    private Vector velocity;
    private Vector acceleration;

    public Player(double x, double y, double width, double height) {
        super(x, y, width, height);
        this.velocity = new Vector(0, 0);
        this.acceleration = new Vector(0, 0);
    }

    public Player(Vector position, double width, double height) {
        super(position, width, height);
        this.velocity = new Vector(0, 0);
        this.acceleration = new Vector(0, 0);
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
    //endregion

    public void update(Level level) {
        Vector newVelocity = new Vector(this.velocity);
        Vector newPosition = new Vector(this.getPosition());
        Boundary newBoundary = new Boundary(this.getBoundary());
        newVelocity.add(this.acceleration);
        newPosition.add(newVelocity);
        newBoundary.setPosition(newPosition);
        if (this.getBoundary().contains(level.getObjective().getBoundary())) {

            System.out.println("win");
        }
        for (Barrier barrier : level.getBarriers()) {
            if (newBoundary.contains(barrier.getBoundary())) {
                if (newPosition.getX() < barrier.getPosition().getX() + barrier.getWidth() ||
                        newPosition.getX() + this.getWidth() > barrier.getPosition().getX()) {
                    newVelocity.setX(0);
                }
                if (newPosition.getY() < barrier.getPosition().getY() + barrier.getHeight() ||
                        newPosition.getY() + this.getHeight() >  barrier.getPosition().getY()) {
                    newVelocity.setY(0);
                }
            }
        }
        this.velocity = newVelocity;
        this.getPosition().add(this.velocity);
        this.getBoundary().setPosition(this.getPosition());
        this.getRectangle().translate(this.velocity.getX(), this.velocity.getY());
        this.acceleration.setX(0);
        this.acceleration.setY(0);
    }


}
