package org.academiadecodigo.bootcamp65.levels;

import org.academiadecodigo.bootcamp65.objects.Barrier;
import org.academiadecodigo.bootcamp65.physics.GravityDirectionType;
import org.academiadecodigo.bootcamp65.physics.Vector;

import java.util.ArrayList;

public class Level {

    private LevelType levelType;

    private ArrayList<Barrier> barriers;

    private Vector startPos;
    private Vector endPos;
    private GravityDirectionType startGravity;
    private Barrier objective;
    private boolean completed;

    public Level(Barrier[] barriers) {
        this.barriers = barriers;
        completed = false;
    }

    public LevelType getLevelType() {
        return levelType;
    }

    public void setLevelType(LevelType levelType) {
        this.levelType = levelType;
    }

    public GravityDirectionType getStartGravity() {
        return startGravity;
    }

    public void setStartGravity(Vector startGravity) {
        this.startGravity = startGravity;
    }

    public ArrayList<Barrier> getBarriers() {
        return barriers;
    }

    public void setBarriers(ArrayList<Barrier> barriers) {
        this.barriers = barriers;
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

    public Barrier getObjective() {
        return objective;
    }

    public void setObjective(Barrier objective) {
        this.objective = objective;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void show() {
        for (Barrier barrier : barriers) {
            barrier.show();
        }
        objective.show();
    }

    public void delete() {
        for (Barrier barrier : barriers) {
            barrier.delete();
        }
        objective.delete();
    }
}
