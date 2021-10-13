package org.academiadecodigo.bootcamp65.levels;

public class LevelFactory {

    private static Level[] levels;


    public static Level createLevel(int levelNumber){
        return levels[levelNumber];
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
