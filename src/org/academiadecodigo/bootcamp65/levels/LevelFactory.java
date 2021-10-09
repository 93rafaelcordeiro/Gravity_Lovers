package org.academiadecodigo.bootcamp65.levels;

import org.academiadecodigo.bootcamp65.objects.Barrier;

public class LevelFactory {

    private Barrier[][] levels;


    public Level createLevel(int levelNumber) {
        return new Level(levels[levelNumber-1]);
    }
}
