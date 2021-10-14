package org.academiadecodigo.bootcamp65;

import org.academiadecodigo.bootcamp65.levels.Level;
import org.academiadecodigo.bootcamp65.objects.Barrier;
import org.academiadecodigo.bootcamp65.objects.GameObject;
import org.academiadecodigo.bootcamp65.objects.Player;
import org.academiadecodigo.bootcamp65.physics.Boundary;
import org.academiadecodigo.bootcamp65.physics.Vector;

public class CollisionDetector {

    private Level level;

    public CollisionDetector(Level level) {
        this.level = level;
    }

    public Vector check(Player player) {
        Vector newVelocity = new Vector(player.getVelocity());
        Vector newPosition = new Vector(player.getPosition());
        Boundary newBoundary = new Boundary(player.getBoundary());
        newVelocity.add(player.getAcceleration());
        newPosition.add(newVelocity);
        newBoundary.setPosition(newPosition);
        if (player.getBoundary().contains(level.getObjective().getBoundary())) {
            level.setCompleted(true);
            System.out.println("win");
        }
        for (Barrier barrier : level.getBarriers()) {
            if (newBoundary.contains(barrier.getBoundary())) {
                if (barrier.isDangerous()) {
                    player.setDead(true);
                    return null;
                }
                if (newPosition.getX() < barrier.getPosition().getX() + barrier.getWidth() ||
                        newPosition.getX() + player.getWidth() > barrier.getPosition().getX()) {
                    newVelocity.setX(0);
                }
                if (newPosition.getY() < barrier.getPosition().getY() + barrier.getHeight() ||
                        newPosition.getY() + player.getHeight() >  barrier.getPosition().getY()) {
                    newVelocity.setY(0);
                }
            }
        }
        return newVelocity;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}