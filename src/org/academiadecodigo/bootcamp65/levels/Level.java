package org.academiadecodigo.bootcamp65.levels;

import org.academiadecodigo.bootcamp65.objects.Block;
import org.academiadecodigo.bootcamp65.physics.GravityDirectionType;
import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;

import java.util.ArrayList;

public class Level {

    private LevelType levelType;
    private int levelNumber;

    private ArrayList<Block> walls;

    private Vector startPos;
    private Vector endPos;
    private GravityDirectionType startGravity;
    private ArrayList<Block> requirements;
    private Block objective;
    private boolean completed;

    public Level(ArrayList<Block> walls) {
        this.walls = walls;
        this.requirements = new ArrayList<>();
        this.completed = false;
    }

    public Level(ArrayList<Block> walls, ArrayList<Block> requirements) {
        this.walls = walls;
        this.requirements = requirements;
        this.completed = false;
    }

    //region Getters and Setters

    public LevelType getLevelType() {
        return levelType;
    }

    public void setLevelType(LevelType levelType) {
        this.levelType = levelType;
    }

    public GravityDirectionType getStartGravity() {
        return startGravity;
    }

    public void setStartGravity(GravityDirectionType startGravity) {
        this.startGravity = startGravity;
    }

    public ArrayList<Block> getWalls() {
        return walls;
    }

    public ArrayList<Block> getRequirements() {
        return requirements;
    }

    public void setRequirements(ArrayList<Block> requirements) {
        this.requirements = requirements;
    }

    public Vector getStartPos() {
        return startPos;
    }

    public void setStartPos(Vector startPos) {
        this.startPos = startPos;
    }

    public Vector getEndPos() {
        return endPos;
    }

    public void setEndPos(Vector endPos) {
        this.endPos = endPos;
    }

    public Block getObjective() {
        return objective;
    }

    public void setObjective(Block objective) {
        this.objective = objective;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getNumber() {
        return this.levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }
    //endregion

    public void show() {
        for (Block wall : walls) {
            if (wall.isDangerous()) {
                wall.setColor(new Color(255, 85, 85));
            }
            wall.show();
        }
        for (Block requirement : requirements) {
            if (requirement.isDestroyed()) {
                requirement.delete();
                continue;
            }
            requirement.setColor(new Color(255, 234, 166));
            requirement.show();
        }
        objective.show();
    }

    public void delete() {
        for (Block block : walls) {
            block.delete();
        }
        for (Block requirement : requirements) {
            requirement.delete();
        }
        objective.delete();
    }
}
