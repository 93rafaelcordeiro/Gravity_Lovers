package org.academiadecodigo.bootcamp65.physics;

import org.academiadecodigo.bootcamp65.levels.Level;
import org.academiadecodigo.bootcamp65.objects.Block;
import org.academiadecodigo.bootcamp65.objects.Objective;
import org.academiadecodigo.bootcamp65.objects.Player;

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
        for (Objective objective : level.getObjectives()) {
            if (player.getBoundary().contains(objective.getBoundary())) {
                level.setCompleted(true);
                level.setNextLevelNumber(objective.getNextLevelNumber());
            }
        }
        if (level.getRequirements() != null) {
            for (Block requirement : level.getRequirements()) {
                if (newBoundary.contains(requirement.getBoundary())) {
                    requirement.setDestroyed(true);
                    requirement.delete();
                }
            }
        }
        for (Block block : level.getWalls()) {
            if (newBoundary.contains(block.getBoundary())) {
                if (block.isDangerous()) {
                    player.setDead(true);
                    return null;
                }

                if (newPosition.getX() < block.getPosition().getX() + block.getWidth() ||
                        newPosition.getX() + player.getWidth() > block.getPosition().getX()) {
                    newVelocity.setX(0);
                }
                if (newPosition.getY() < block.getPosition().getY() + block.getHeight() ||
                        newPosition.getY() + player.getHeight() > block.getPosition().getY()) {
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