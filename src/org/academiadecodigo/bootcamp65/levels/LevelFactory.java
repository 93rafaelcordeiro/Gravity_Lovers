package org.academiadecodigo.bootcamp65.levels;

import org.academiadecodigo.bootcamp65.objects.Barrier;

public class LevelFactory {

    private static Barrier[][] levels;


    public static Level createLevel(int levelNumber){
        return new Level(levels[levelNumber-1]);
    }

    public static Level createLevel(LevelType levelType){
        switch (levelType) {
            case MAIN_MENU:
                break;
            case DEATH_MENU:
                break;
            case GRAVITY_CONTROL:
                return LevelType.getLevel_1();
            default:
                break;
        }

        return null;
    }
}
