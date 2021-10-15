package org.academiadecodigo.bootcamp65.levels;

import org.academiadecodigo.bootcamp65.Game;
import org.academiadecodigo.bootcamp65.objects.Block;
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
    // Completed - Andre
    private static Level getLevel_1() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                //Barriers
                new Block(400, 300, 20, 100),
                new Block(400, 500, 20, 100),
                new Block(10, 500, 300, 20),
                new Block(740, 120, 20, 480),
                new Block(300, 300, 100, 20),
                new Block(100, 200, 20, 200),
                new Block(10, 120, 100, 20),
                new Block(200, 120, 100, 20),
                new Block(200, 10, 20, 120),
                new Block(600, 20, 20, 60),
                new Block(500, 200, 20, 100),
                new Block(500, 200, 50, 20),
                new Block(650, 300, 20, 100),
                new Block(600, 200, 150, 20),
                new Block(500, 500, 150, 20)
        )));
        level.setLevelType(LevelType.GRAVITY_CONTROL);
        level.setLevelNumber(1);

        level.setStartGravity(GravityDirectionType.DOWN);
        level.setStartPos(new Vector(50, 550));
        level.setEndPos(new Vector(765, 570));

        level.setObjective(new Block(level.getEndPos(), 30, 30));
        level.getObjective().setColor(new Color(255, 150, 191));

        return level;
    }
    // Completed - Rafa
    private static Level getLevel_2() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                // Barriers

                new Block(100, 10, 20, 130),
                new Block(10, 180, 80, 20),
                new Block(190, 48, 20, 170),
                new Block(53, 248, 190, 20),
                new Block(80, 310, 90, 255),
                new Block(223, 300, 20, 270),
                new Block(360, 180, 20, 395),
                new Block(360, 51, 190, 60),
                new Block(530, 109, 20, 463),
                new Block(583, 100, 160, 60),
                new Block(530, 191, 210, 20),
                new Block(630, 248, 130, 130),
                new Block(600, 480, 200, 20),
                new Block(650, 500, 20, 20),
                new Block(650, 560, 20, 40)
        )));
        level.setLevelType(LevelType.GRAVITY_CONTROL);
        level.setLevelNumber(2);
        level.setStartGravity(GravityDirectionType.UP);
        level.setStartPos(new Vector(50, 50));
        level.setEndPos(new Vector(750, 570));
        level.setObjective(new Block(level.getEndPos(), 30, 30));
        level.getObjective().setColor(new Color(255, 150, 191));
        return level;
    }
    // Done - Silveira
    private static Level getLevel_3() {
        return null;
    }
    // Completed - Rafa
    private static Level getLevel_4() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
            // Walls
            new Block(10, 10, Game.GRID_WIDTH, 10),
            new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
            new Block(10, 10, 10, Game.GRID_HEIGHT),
            new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
            new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
            new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
            //Barriers
            new Block(80, 290, 615, 20),
            new Block(730, 280, 10, 40),
            new Block(70, 280, 10, 40),
            new Block(10, 380, 60, 10),
            new Block(10, 500, 60, 10),
            new Block(10, 90, 60, 10),
            new Block(10, 220, 60, 10),
            new Block(180, 338, 10, 225),
            new Block(180, 45, 10, 220),
            new Block(110, 150, 80, 10),
            new Block(110, 450, 80, 10),
            //new Barrier(730, 270, 80, 10),
            new Block(730, 320, 80, 10),
            new Block(730, 370, 10, 230),
            new Block(730, 115, 10, 135),
            new Block(220, 540, 105, 10),
            new Block(360, 540, 342, 10),

            new Block(228, 430, 473, 10),

            new Block(300, 310, 10, 80),
            new Block(560, 310, 10, 80),
            new Block(410, 350, 10, 80),
            new Block(300, 10, 10, 80),
            new Block(430, 53, 10, 80),
            new Block(560, 10, 10, 80),
            new Block(225, 130, 477  , 10),
            new Block(360, 210, 342, 10),
            new Block(220, 210, 105, 10)
        )));
        level.setStartGravity(GravityDirectionType.LEFT);
        level.setLevelNumber(4);
        level.setStartPos(new Vector(30, 285));
        level.setEndPos(new Vector(770, 285));
        level.setObjective(new Block(level.getEndPos(), 30, 30));
        level.getObjective().setColor(new Color(255,150,191));
        return level;
    }
    // Completed - Andre
    private static Level getLevel_5() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                //Barriers
                new Block(400, 300, 20, 100),
                new Block(400, 500, 20, 100),
                new Block(10, 500, 300, 20),
                new Block(740, 120, 20, 450),
                new Block(300, 300, 100, 20),
                new Block(100, 200, 20, 200),
                new Block(20, 120, 100, 20, true),
                new Block(200, 120, 100, 20),
                new Block(200, 10, 20, 120),
                new Block(600, 20, 20, 60, true),
                new Block(500, 200, 20, 100),
                new Block(500, 200, 50, 20),
                new Block(650, 300, 20, 100),
                new Block(600, 200, 150, 20),
                new Block(500, 500, 150, 20, true)
        )));
        level.setLevelType(LevelType.GRAVITY_CONTROL);
        level.setLevelNumber(5);
        level.setStartGravity(GravityDirectionType.DOWN);
        level.setStartPos(new Vector(50, 550));
        level.setEndPos(new Vector(765, 570));
        level.setObjective(new Block(level.getEndPos(), 30, 30));
        level.getObjective().setColor(new Color(255, 150, 191));
        return level;
    }
    // Completed - Rafa
    private static Level getLevel_6() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                // Barriers

                new Block(100, 10, 20, 130),
                new Block(10, 180, 80, 20),
                new Block(190, 48, 20, 170),
                new Block(53, 248, 190, 20),
                new Block(80, 310, 90, 255, true),
                new Block(223, 300, 20, 270),
                new Block(360, 180, 20, 395),
                new Block(360, 51, 190, 60),
                new Block(530, 109, 20, 463),
                new Block(583, 100, 160, 60, true),
                new Block(530, 191, 210, 20),
                new Block(630, 248, 130, 130, true),
                new Block(600, 480, 200, 20),
                new Block(650, 500, 20, 20, true),
                new Block(650, 560, 20, 40, true)
        )));
        level.setLevelType(LevelType.GRAVITY_CONTROL);
        level.setLevelNumber(6);
        level.setStartGravity(GravityDirectionType.UP);
        level.setStartPos(new Vector(50, 50));
        level.setEndPos(new Vector(750, 570));
        level.setObjective(new Block(level.getEndPos(), 30, 30));
        level.getObjective().setColor(new Color(255, 150, 191));
        return level;
    }
    //
    private static Level getLevel_7() {
        return null;
    }
    // In Progress - Rafa
    private static Level getLevel_8() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                // Barriers

                new Block(100, 10, 20, 130),
                new Block(10, 180, 80, 20),
                new Block(190, 48, 20, 170),
                new Block(53, 248, 190, 20),
                new Block(80, 310, 90, 255),
                new Block(223, 300, 20, 270),
                new Block(360, 180, 20, 395),
                new Block(360, 51, 190, 60),
                new Block(530, 109, 20, 463),
                new Block(583, 100, 160, 60),
                new Block(530, 191, 210, 20),
                new Block(630, 248, 130, 130),
                new Block(600, 480, 200, 20),
                new Block(650, 500, 20, 20),
                new Block(650, 560, 20, 40)
        )), new ArrayList<Block>(Arrays.asList(
                new Block(0,0,30,30),
                new Block(40,0,30,30)
        )));
        level.setLevelType(LevelType.GRAVITY_CONTROL);
        level.setLevelNumber(8);
        level.setStartGravity(GravityDirectionType.UP);
        level.setStartPos(new Vector(50, 50));
        level.setEndPos(new Vector(750, 570));
        level.setObjective(new Block(level.getEndPos(), 30, 30));
        level.getObjective().setColor(new Color(255, 150, 191));
        return level;
    }

    private static Level getLevel_9() {
        return null;
    }

    private static Level getLevel_10() {
        return null;
    }
}
