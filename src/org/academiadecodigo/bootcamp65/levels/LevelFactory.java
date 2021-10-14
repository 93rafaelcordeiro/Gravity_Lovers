package org.academiadecodigo.bootcamp65.levels;

import org.academiadecodigo.bootcamp65.Game;
import org.academiadecodigo.bootcamp65.objects.Barrier;
import org.academiadecodigo.bootcamp65.physics.GravityDirectionType;
import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;

import java.util.ArrayList;
import java.util.Arrays;

public class LevelFactory {

    public static Level createLevel(int levelNumber) {
        switch (levelNumber) {
            case 0:
                return LevelFactory.getMenuLevel();
            case 1:
                return LevelFactory.getLevel_1();
            case 2:
                return LevelFactory.getLevel_2();
            case 3:
                return LevelFactory.getLevel_3();
            case 4:
                return LevelFactory.getLevel_4();
            case 5:
                return LevelFactory.getLevel_5();
            case 6:
                return LevelFactory.getLevel_6();
            case 7:
                return LevelFactory.getLevel_7();
            case 8:
                return LevelFactory.getLevel_8();
            case 9:
                return LevelFactory.getLevel_9();
            case 10:
                return LevelFactory.getLevel_10();
            default:
                return LevelFactory.getMenuLevel();
        }
    }

    private static Level getMenuLevel() {
        return null;
    }

    private static Level getLevel_1() {
        Level level = new Level(new ArrayList<Barrier>(Arrays.asList(
                // Walls
                new Barrier(10, 10, Game.GRID_WIDTH, 10),
                new Barrier(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Barrier(10, 10, 10, Game.GRID_HEIGHT),
                new Barrier(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Barrier(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Barrier(Game.GRID_WIDTH - 50, 60, 50, 10),
                //Barriers
                new Barrier(400, 300, 20, 100),
                new Barrier(400, 500, 20, 100),
                new Barrier(10, 500, 300, 20),
                new Barrier(740, 120, 20, 480),
                new Barrier(300, 300, 100, 20),
                new Barrier(100, 200, 20, 200),
                new Barrier(10, 120, 100, 20),
                new Barrier(200, 120, 100, 20),
                new Barrier(200, 10, 20, 120),
                new Barrier(600, 20, 20, 60),
                new Barrier(500, 200, 20, 100),
                new Barrier(500, 200, 50, 20),
                new Barrier(650, 300, 20, 100),
                new Barrier(600, 200, 150, 20),
                new Barrier(500, 500, 150, 20)
        )));
        level.setLevelType(LevelType.GRAVITY_CONTROL);
        level.setStartGravity(GravityDirectionType.DOWN);
        level.setStartPos(new Vector(50, 550));
        level.setEndPos(new Vector(765, 570));
        level.setObjective(new Barrier(level.getEndPos(), 30, 30));
        level.getObjective().setColor(new Color(255, 150, 191));
        return level;
    }


    private static Level getLevel_2() {
        Level level = new Level(new ArrayList<Barrier>(Arrays.asList(
                // Walls
                new Barrier(10, 10, Game.GRID_WIDTH, 10),
                new Barrier(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Barrier(10, 10, 10, Game.GRID_HEIGHT),
                new Barrier(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Barrier(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Barrier(Game.GRID_WIDTH - 50, 60, 50, 10),
                // Barriers

                new Barrier(100, 10, 20, 130),
                new Barrier(10, 180, 80, 20),
                new Barrier(190, 48, 20, 170),
                new Barrier(53, 248, 190, 20),
                new Barrier(80, 310, 90, 255),
                new Barrier(223, 300, 20, 270),
                new Barrier(360, 180, 20, 395),
                new Barrier(360, 51, 190, 60),
                new Barrier(530, 109, 20, 463),
                new Barrier(583, 100, 160, 60),
                new Barrier(530, 191, 210, 20),
                new Barrier(630, 248, 130, 130),
                new Barrier(600, 480, 200, 20),
                new Barrier(650, 500, 20, 20),
                new Barrier(650, 560, 20, 40)
        )));
        level.setLevelType(LevelType.GRAVITY_CONTROL);
        level.setStartGravity(GravityDirectionType.UP);
        level.setStartPos(new Vector(50, 50));
        level.setEndPos(new Vector(750, 570));
        level.setObjective(new Barrier(level.getEndPos(), 30, 30));
        level.getObjective().setColor(new Color(255, 150, 191));
        return level;
    }


    private static Level getLevel_3() {
        return null;
    }

    private static Level getLevel_4() {
        Level level = new Level(new ArrayList<Barrier>(Arrays.asList(
            // Walls
            new Barrier(10, 10, Game.GRID_WIDTH, 10),
            new Barrier(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
            new Barrier(10, 10, 10, Game.GRID_HEIGHT),
            new Barrier(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
            new Barrier(Game.GRID_WIDTH - 50, 10, 10, 50),
            new Barrier(Game.GRID_WIDTH - 50, 60, 50, 10),
            //Barriers
            new Barrier(80, 290, 650, 20),
            new Barrier(730, 280, 10, 40),
            new Barrier(70, 280, 10, 40),
            new Barrier(10, 380, 60, 10),
            new Barrier(10, 500, 60, 10),
            new Barrier(10, 90, 60, 10),
            new Barrier(10, 220, 60, 10),
            new Barrier(180, 338, 10, 225),
            new Barrier(180, 53, 10, 215),
            new Barrier(110, 150, 80, 10),
            new Barrier(110, 450, 80, 10),
            new Barrier(730, 270, 60, 10),
            new Barrier(730, 320, 60, 10),
            new Barrier(730, 370, 10, 230),
            new Barrier(730, 10, 10, 220),
            new Barrier(220, 540, 105, 10),
            new Barrier(360, 540, 342, 10),

            new Barrier(228, 430, 473, 10),

            new Barrier(300, 310, 10, 80),
            new Barrier(560, 310, 10, 80),
            new Barrier(410, 350, 10, 80),
            new Barrier(300, 10, 10, 80),
            new Barrier(430, 53, 10, 80),
            new Barrier(560, 10, 10, 80),
            new Barrier(220, 130, 477  , 10),
            new Barrier(360, 210, 342, 10),
            new Barrier(220, 210, 105, 10)
        )));
        for (Barrier barrier : level.getBarriers()) {
            barrier.setColor(new Color(190,152,214));
        }
        level.setStartGravity(GravityDirectionType.DOWN);
        level.setStartPos(new Vector(50, 550));
        level.setEndPos(new Vector(765, 570));
        level.setObjective(new Barrier(level.getEndPos(), 30, 30));
        level.getObjective().setColor(new Color(255,150,191));
        return level;
    }

    private static Level getLevel_5() {
        return null;
    }

    private static Level getLevel_6() {
        return null;
    }

    private static Level getLevel_7() {
        return null;
    }

    private static Level getLevel_8() {
        return null;
    }

    private static Level getLevel_9() {
        return null;
    }

    private static Level getLevel_10() {
        return null;
    }
}
