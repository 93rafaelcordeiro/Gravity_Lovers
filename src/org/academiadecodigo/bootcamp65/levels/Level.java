package org.academiadecodigo.bootcamp65.levels;

import org.academiadecodigo.bootcamp65.objects.Barrier;
import org.academiadecodigo.bootcamp65.physics.Vector;

public class Level {

    private LevelType levelType;

    private Barrier[] barriers;

    private Vector startPos;
    private Vector endPos;
    private Vector startGravity;
    private Barrier objective;

    public Level(Barrier[] barriers) {
        this.barriers = barriers;
    }

    public LevelType getLevelType() {
        return levelType;
    }

    public void setLevelType(LevelType levelType) {
        this.levelType = levelType;
    }

    public Vector getStartGravity() {
        return startGravity;
    }

    public void setStartGravity(Vector startGravity) {
        this.startGravity = startGravity;
    }

    public Barrier[] getBarriers() {
        return barriers;
    }

    public void setBarriers(Barrier[] barriers) {
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

    public void show() {
        for (Barrier barrier : barriers) {
            barrier.show();
        }
        objective.show();
    }
}
