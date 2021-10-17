package org.academiadecodigo.bootcamp65.physics;

import org.academiadecodigo.bootcamp65.Game;
import org.academiadecodigo.bootcamp65.levels.Level;
import org.academiadecodigo.bootcamp65.objects.Block;
import org.academiadecodigo.bootcamp65.objects.Objective;
import org.academiadecodigo.bootcamp65.objects.Player;

public class CollisionDetector {

    private Game game;

    public CollisionDetector(Game game) {
        this.game = game;
    }

    public Vector check(Player player) {
        Vector newVelocity = new Vector(player.getVelocity());
        Vector newPosition = new Vector(player.getPosition());
        Boundary newBoundary = new Boundary(player.getBoundary());
        newVelocity.add(player.getAcceleration());
        newPosition.add(newVelocity);
        newBoundary.setPosition(newPosition);
        for (Objective objective : this.game.getLevel().getObjectives()) {
            if (player.getBoundary().contains(objective.getBoundary())) {
                this.game.getLevel().setCompleted(true);
                this.game.getLevel().setNextLevelNumber(objective.getNextLevelNumber());
            }
        }
        if (this.game.getLevel().getRequirements() != null) {
            for (Block requirement : this.game.getLevel().getRequirements()) {
                if (newBoundary.contains(requirement.getBoundary())) {
                    requirement.setDestroyed(true);
                    requirement.delete();
                }
            }
        }
        for (Block block : this.game.getLevel().getWalls()) {
            if (newBoundary.contains(block.getBoundary())) {
                player.setJumping(false);
                if (block.isDangerous()) {
                    player.setDead(true);
                    return null;
                }

                if ((newPosition.getX() < block.getPosition().getX() + block.getWidth() ||
                    newPosition.getX() + player.getWidth() > block.getPosition().getX())) {
                    newVelocity.setX(0);
                }
                if ((newPosition.getY() < block.getPosition().getY() + block.getHeight() ||
                    newPosition.getY() + player.getHeight() > block.getPosition().getY())) {
                    newVelocity.setY(0);
                }
            }
        }
        return newVelocity;
    }
}