package org.academiadecodigo.bootcamp65.levels;

import org.academiadecodigo.bootcamp65.objects.Barrier;
import org.academiadecodigo.bootcamp65.physics.Vector;

public class Level {

    private LevelType levelType;

    private Vector startPos;
    private Barrier[] barriers;
    private Vector destination;

    public Level(Barrier[] barriers) {
        this.barriers = barriers;
    }

    public LevelType getLevelType() {
        return levelType;
    }

    public void setLevelType(LevelType levelType) {
        this.levelType = levelType;
    }

    public Barrier[] getBarriers() {
        return barriers;
    }

    public void setBarriers(Barrier[] barriers) {
        this.barriers = barriers;
    }

    public Vector getDestination() {
        return destination;
    }

    public void setDestination(Vector destination) {
        this.destination = destination;
    }

    public void show() {
        for (Barrier barrier : barriers) {
            barrier.show();
        }
    }
}
