package org.academiadecodigo.bootcamp65.levels;

import org.academiadecodigo.bootcamp65.Game;
import org.academiadecodigo.bootcamp65.objects.Block;
import org.academiadecodigo.bootcamp65.objects.Objective;
import org.academiadecodigo.bootcamp65.physics.GravityDirectionType;
import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;
import java.util.Arrays;

public class LevelFactory {

    public static Level createLevel(int levelNumber) {
        switch (levelNumber) {
            case -1:
                return LevelFactory.getLeaderboardLevel();
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

    private static Level getLeaderboardLevel() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10)
                //Blocks
        )));
        level.setLevelType(LevelType.MAIN_MENU);
        level.setLevelNumber(0);
        level.setBackground(new Picture(10,10,"resources/main-menu.png"));

        level.setStartGravity(GravityDirectionType.DOWN);
        level.setStartPos(new Vector(50, 550));
        level.setEndPos(new Vector(765, 570));

        level.setObjectives(new ArrayList<Objective>(Arrays.asList(
                new Objective(level.getEndPos(), 30, 30, 0)
        )));

        for (Objective objective : level.getObjectives()) {
            objective.setColor(new Color(255, 150, 191));
        }
        level.getObjectives().get(0).setPicture(new Picture(level.getObjectives().get(0).getPosition().getX(), level.getObjectives().get(0).getPosition().getY(), "resources/baljeeta.png"));

        return level;
    }

    // Im Progress - Andre
    private static Level getMenuLevel() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                //Blocks
                    // Start
                //new Block(100,450, 250,10),
                new Block(100,450, 10,80),
                new Block(100,520, 250,10),
                new Block(340,450, 10,80),

                    // Leaderboard
                //new Block(450,450, 250,10),
                new Block(450,450, 10,80),
                new Block(450,520, 250,10),
                new Block(690,450, 10,80)
        )));
        level.setLevelType(LevelType.MAIN_MENU);
        level.setLevelNumber(0);
        level.setBackground(new Picture(10,10,"resources/main-menu.png"));

        level.setStartGravity(GravityDirectionType.DOWN);
        level.setStartPos(new Vector(50, 550));
        level.setEndPos(new Vector(300, 490));

        level.setObjectives(new ArrayList<Objective>(Arrays.asList(
                new Objective(level.getEndPos(), 30, 30, 1),
                new Objective(640, 490, 30,30, -1)
        )));

        for (Objective objective : level.getObjectives()) {
            objective.setColor(new Color(255, 150, 191));
        }
        level.getObjectives().get(0).setPicture(new Picture(level.getObjectives().get(0).getPosition().getX(), level.getObjectives().get(0).getPosition().getY(), "resources/baljeeta.png"));

        return level;
    }
    // Completed - Andre 1 - Regular
    private static Level getLevel_1() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                //Blocks
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
        level.setBackground(new Picture(10,10,"resources/default.png"));

        level.setStartGravity(GravityDirectionType.DOWN);
        level.setStartPos(new Vector(50, 550));
        level.setEndPos(new Vector(765, 570));

        level.setObjectives(new ArrayList<Objective>(Arrays.asList(
                new Objective(level.getEndPos(), 30, 30, 2)
        )));

        for (Objective objective : level.getObjectives()) {
            objective.setColor(new Color(255, 150, 191));
        }
        level.getObjectives().get(0).setPicture(new Picture(level.getObjectives().get(0).getPosition().getX(), level.getObjectives().get(0).getPosition().getY(), "resources/baljeeta.png"));

        return level;
    }
    // Completed - Rafa 1 - Regular
    private static Level getLevel_2() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                // Block()s

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
        level.setBackground(new Picture(10,10,"resources/default.png"));

        level.setStartGravity(GravityDirectionType.UP);
        level.setStartPos(new Vector(50, 50));
        level.setEndPos(new Vector(750, 570));

        level.setObjectives(new ArrayList<Objective>(Arrays.asList(
                new Objective(level.getEndPos(), 30, 30, 3)
        )));

        for (Objective objective : level.getObjectives()) {
            objective.setColor(new Color(255, 150, 191));
        }
        level.getObjectives().get(0).setPicture(new Picture(level.getObjectives().get(0).getPosition().getX(), level.getObjectives().get(0).getPosition().getY(), "resources/baljeeta.png"));


        return level;
    }
    // Completed - Silveira 1 -Regular
    private static Level getLevel_3() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                // Block()s
                new Block(380,20,10,100),
                new Block(440,20,10,100),
                new Block(290,120,100,10),
                new Block(440,120,100,10),
                new Block(530,120,10,50),
                new Block(530,170,270,120),
                new Block(290,120,10,50),
                new Block(20,120,290,190),
                new Block(400,200,80,10),
                new Block(240,550,10,50),
                new Block(10,500,180,100),
                new Block(250,450,50,10),
                new Block(600,550,100,50),
                new Block(450,350,120,10),
                new Block(600,350,10,165),
                new Block(300,350,150,100),
                new Block(10,300,200,10),
                new Block(10,350,180,150),
                new Block(350,300,10,50),
                new Block(180,500,170,10),
                new Block(285,550,100,10),
                new Block(285,550,10,20),
                new Block(100,350,100,10),
                new Block(600,380,60,10),
                new Block(650,440,60,10),
                new Block(700,380,10,60),
                new Block(600,550,60,10),
                new Block(700,550,75,10),
                new Block(450,500,100,100),
                new Block(180,310,50,10),
                new Block(550,400,50,10),
                new Block(380,450,20,20),
                new Block(445,500,20,10)
        )));
        level.setLevelType(LevelType.GRAVITY_CONTROL);
        level.setLevelNumber(3);
        level.setBackground(new Picture(10,10,"resources/default.png"));

        level.setStartGravity(GravityDirectionType.UP);
        level.setStartPos(new Vector(400, 25));
        level.setEndPos(new Vector(200, 570));

        level.setObjectives(new ArrayList<Objective>(Arrays.asList(
                new Objective(level.getEndPos(), 30, 30, 4)
        )));

        for (Objective objective : level.getObjectives()) {
            objective.setColor(new Color(255, 150, 191));
        }
        level.getObjectives().get(0).setPicture(new Picture(level.getObjectives().get(0).getPosition().getX(), level.getObjectives().get(0).getPosition().getY(), "resources/baljeeta.png"));

        return level;
    }
    // Completed - Rafa 2 - Regular
    private static Level getLevel_4() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                //Block()s
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
                //new Block()(730, 270, 80, 10),
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
                new Block(225, 130, 477, 10),
                new Block(360, 210, 342, 10),
                new Block(220, 210, 105, 10)
        )));
        level.setLevelType(LevelType.GRAVITY_CONTROL);
        level.setLevelNumber(4);
        level.setBackground(new Picture(10,10,"resources/default.png"));

        level.setStartGravity(GravityDirectionType.LEFT);
        level.setStartPos(new Vector(30, 285));
        level.setEndPos(new Vector(770, 285));

        level.setObjectives(new ArrayList<Objective>(Arrays.asList(
                new Objective(level.getEndPos(), 30, 30, 5)
        )));

        for (Objective objective : level.getObjectives()) {
            objective.setColor(new Color(255, 150, 191));
        }
        level.getObjectives().get(0).setPicture(new Picture(level.getObjectives().get(0).getPosition().getX(), level.getObjectives().get(0).getPosition().getY(), "resources/baljeeta.png"));

        return level;
    }
    // Completed - Andre 1 - Dangerous
    private static Level getLevel_5() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                //Block()s
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
        level.setBackground(new Picture(10,10,"resources/default.png"));

        level.setStartGravity(GravityDirectionType.DOWN);
        level.setStartPos(new Vector(50, 550));
        level.setEndPos(new Vector(765, 570));

        level.setObjectives(new ArrayList<Objective>(Arrays.asList(
                new Objective(level.getEndPos(), 30, 30, 6)
        )));

        for (Objective objective : level.getObjectives()) {
            objective.setColor(new Color(255, 150, 191));
        }
        level.getObjectives().get(0).setPicture(new Picture(level.getObjectives().get(0).getPosition().getX(), level.getObjectives().get(0).getPosition().getY(), "resources/baljeeta.png"));

        return level;
    }
    // Completed - Rafa 1 - Dangerous
    private static Level getLevel_6() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                // Block()s

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
        level.setBackground(new Picture(10,10,"resources/default.png"));

        level.setStartGravity(GravityDirectionType.UP);
        level.setStartPos(new Vector(50, 50));
        level.setEndPos(new Vector(750, 570));

        level.setObjectives(new ArrayList<Objective>(Arrays.asList(
                new Objective(level.getEndPos(), 30, 30, 7)
        )));

        for (Objective objective : level.getObjectives()) {
            objective.setColor(new Color(255, 150, 191));
        }
        level.getObjectives().get(0).setPicture(new Picture(level.getObjectives().get(0).getPosition().getX(), level.getObjectives().get(0).getPosition().getY(), "resources/baljeeta.png"));

        return level;
    }
    // Completed - Andre 1 - Coins
    private static Level getLevel_7() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                //Block()s
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
                new Block(500, 500, 150, 20),
                new Block(760, 140, 40, 20, false, true)
        )), new ArrayList<Block>(Arrays.asList(
                new Block(30, 50, 30, 30),
                new Block(570, 330, 30, 30)
        )));
        level.setLevelType(LevelType.GRAVITY_CONTROL);
        level.setLevelNumber(7);
        level.setBackground(new Picture(10,10,"resources/default.png"));

        level.setStartGravity(GravityDirectionType.DOWN);
        level.setStartPos(new Vector(50, 550));
        level.setEndPos(new Vector(765, 570));

        level.setObjectives(new ArrayList<Objective>(Arrays.asList(
                new Objective(level.getEndPos(), 30, 30, 8)
        )));

        for (Objective objective : level.getObjectives()) {
            objective.setColor(new Color(255, 150, 191));
        }
        level.getObjectives().get(0).setPicture(new Picture(level.getObjectives().get(0).getPosition().getX(), level.getObjectives().get(0).getPosition().getY(), "resources/baljeeta.png"));

        return level;
    }
    // Completed - Rafa 1 - Coins
    private static Level getLevel_8() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                // Block()s
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
                new Block(650, 560, 20, 40),
                new Block(650, 520, 20, 40, false, true)
        )), new ArrayList<Block>(Arrays.asList(
                new Block(440, 550, 30, 30),
                new Block(680, 390, 30, 30)
        )));
        level.setLevelType(LevelType.GRAVITY_CONTROL);
        level.setLevelNumber(8);
        level.setBackground(new Picture(10,10,"resources/default.png"));

        level.setStartGravity(GravityDirectionType.UP);
        level.setStartPos(new Vector(50, 50));
        level.setEndPos(new Vector(750, 570));

        level.setObjectives(new ArrayList<Objective>(Arrays.asList(
                new Objective(level.getEndPos(), 30, 30, 9)
        )));

        for (Objective objective : level.getObjectives()) {
            objective.setColor(new Color(255, 150, 191));
        }
        level.getObjectives().get(0).setPicture(new Picture(level.getObjectives().get(0).getPosition().getX(), level.getObjectives().get(0).getPosition().getY(), "resources/baljeeta.png"));

        return level;
    }
    // Completed - Rafa 2 - Coins
    private static Level getLevel_9() {
        Level level = new Level(new ArrayList<Block>(Arrays.asList(
                // Walls
                new Block(10, 10, Game.GRID_WIDTH, 10),
                new Block(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Block(10, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Block(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Block(Game.GRID_WIDTH - 50, 60, 50, 10),
                //Block()s
                new Block(80, 290, 650, 20),
                new Block(730, 280, 10, 50),
                new Block(70, 280, 10, 50),
                new Block(10, 380, 60, 10),
                new Block(10, 500, 60, 10),
                new Block(10, 90, 60, 10),
                new Block(10, 220, 60, 10),
                new Block(180, 338, 10, 225),
                new Block(180, 53, 10, 215),
                new Block(110, 150, 80, 10),
                new Block(110, 450, 80, 10),
                new Block(730, 270, 60, 10),
                new Block(740, 320, 50, 10, false, true),
                new Block(730, 370, 10, 230),
                new Block(730, 10, 10, 220),
                new Block(220, 540, 105, 10),
                new Block(360, 540, 342, 10),
                new Block(228, 430, 473, 10),
                new Block(300, 310, 10, 80),
                new Block(560, 310, 10, 80),
                new Block(410, 350, 10, 80),
                new Block(300, 10, 10, 80),
                new Block(430, 53, 10, 80),
                new Block(560, 10, 10, 80),
                new Block(220, 130, 477  , 10),
                new Block(360, 210, 342, 10),
                new Block(220, 210, 105, 10)

        )), new ArrayList<Block>(Arrays.asList(
                new Block(755, 80, 30, 30),
                new Block(755, 550, 30, 30)
        )));
        level.setStartGravity(GravityDirectionType.LEFT);
        level.setLevelNumber(9);
        level.setBackground(new Picture(10,10,"resources/default.png"));

        level.setStartPos(new Vector(30, 285));
        level.setEndPos(new Vector(770, 285));

        level.setObjectives(new ArrayList<Objective>(Arrays.asList(
                new Objective(level.getEndPos(), 30, 30, 10)
        )));

        for (Objective objective : level.getObjectives()) {
            objective.setColor(new Color(255, 150, 191));
        }
        level.getObjectives().get(0).setPicture(new Picture(level.getObjectives().get(0).getPosition().getX(), level.getObjectives().get(0).getPosition().getY(), "resources/baljeeta.png"));

        return level;
    }

    private static Level getLevel_10() {
        return null;
    }/**/
}
