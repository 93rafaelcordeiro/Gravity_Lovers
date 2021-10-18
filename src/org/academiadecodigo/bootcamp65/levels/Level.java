package org.academiadecodigo.bootcamp65.levels;

import org.academiadecodigo.bootcamp65.objects.Block;
import org.academiadecodigo.bootcamp65.objects.Objective;
import org.academiadecodigo.bootcamp65.physics.GravityDirectionType;
import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;
import java.util.List;

public class Level {

    private LevelType levelType;
    private int levelNumber;
    private int nextLevelNumber;

    private Vector startPos;
    private Vector endPos;
    private GravityDirectionType startGravity;

    private List<Block> walls;
    private List<Block> requirements;
    private List<Objective> objectives;

    private boolean completed;
    private Picture background;

    public static final Color DEFAULT_BACKGROUND_COLOR = new Color(255, 214, 252);

    public Level(ArrayList<Block> walls) {
        this.walls = walls;
        this.requirements = null;
        this.completed = false;
    }

    public Level(ArrayList<Block> walls, ArrayList<Block> requirements) {
        this.walls = walls;
        this.requirements = requirements;
        this.completed = false;
    }

    public Level(ArrayList<Block> walls, ArrayList<Block> requirements, ArrayList<Objective> objectives) {
        this.walls = walls;
        this.requirements = requirements;
        this.objectives = objectives;
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

    public List<Block> getWalls() {
        return walls;
    }

    public List<Block> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Block> requirements) {
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

    public List<Objective> getObjectives() {
        return objectives;
    }

    public void setObjectives(List<Objective> objectives) {
        this.objectives = objectives;
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

    public void setBackground(Picture background) {
        this.background = background;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public int getNextLevelNumber() {
        return nextLevelNumber;
    }

    public void setNextLevelNumber(int nextLevelNumber) {
        this.nextLevelNumber = nextLevelNumber;
    }
//endregion

    public void show() {
        if (this.background != null) {
            this.background.draw();
        }
        for (Block wall : walls) {
            if (wall.isDangerous()) {
                wall.setColor(new Color(255, 85, 85));
            }
            if (wall.isDestroyable()) {
                wall.setColor(new Color(255, 234, 166));
            }
            if (wall.isDestroyed()) {
                wall.delete();
                continue;
            }
            wall.show();
        }
        if (requirements != null) {
            for (Block requirement : requirements) {
                if (requirement.isDestroyed()) {
                    requirement.delete();
                    continue;
                }
                requirement.setColor(new Color(255, 234, 166));
                requirement.show();
            }
        }
        for (Objective objective : objectives) {
            objective.show();
        }
    }

    public void delete() {
        if (this.background != null) {
            this.background.delete();
        }
        for (Block block : walls) {
            block.delete();
        }
        if (requirements != null) {
            for (Block requirement : requirements) {
                requirement.delete();
            }
        }
        for (Objective objective : objectives) {
            objective.delete();
        }
    }
}
