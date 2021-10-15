package org.academiadecodigo.bootcamp65.levels;

import org.academiadecodigo.bootcamp65.Game;
import org.academiadecodigo.bootcamp65.objects.Barrier;
import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;

public enum LevelType {
    MAIN_MENU,
    DEATH_MENU,
    GRAVITY_CONTROL;

    public static Level getLevel_1() {
        Level level = new Level(new Barrier[]{
                // Walls
                new Barrier(10, 10, Game.GRID_WIDTH, 10),
                new Barrier(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Barrier(10, 10, 10, Game.GRID_HEIGHT),
                new Barrier(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Barrier(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Barrier(Game.GRID_WIDTH - 50, 60, 50, 10),
                //Barriers
                new Barrier(400, 300, 10, 100),
                new Barrier(400, 500, 10, 100),
                new Barrier(10, 500, 300, 10),
                new Barrier(750, 120, 10, 480),
                new Barrier(300, 300, 100, 10),
                new Barrier(100, 200, 10, 200),
                new Barrier(10, 120, 100, 10),
                new Barrier(200, 120, 100, 10),
                new Barrier(200, 10, 10, 120),
                new Barrier(600, 10, 10, 60),
                new Barrier(500, 200, 10, 100),
                new Barrier(500, 200, 50, 10),
                new Barrier(650, 300, 10, 100),
                new Barrier(600, 200, 150, 10),
                new Barrier(500, 500, 150, 10)
        });
        for (Barrier barrier : level.getBarriers()) {
            barrier.setColor(new Color(190,152,214));
        }
        level.setStartGravity(new Vector(0, Game.getGravityPull()));
        level.setStartPos(new Vector(50, 550));
        level.setEndPos(new Vector(765, 570));
        level.setObjective(new Barrier(level.getEndPos(), 30, 30));
        level.getObjective().setColor(new Color(255,150,191));

        return level;
    }

    public static Level getLevel_2() {
        Level level = new Level(new Barrier[]{
                // Walls
                new Barrier(10, 10, Game.GRID_WIDTH, 10),
                new Barrier(10, Game.GRID_HEIGHT, Game.GRID_WIDTH, 10),
                new Barrier(10, 10, 10, Game.GRID_HEIGHT),
                new Barrier(Game.GRID_WIDTH, 10, 10, Game.GRID_HEIGHT),
                new Barrier(Game.GRID_WIDTH - 50, 10, 10, 50),
                new Barrier(Game.GRID_WIDTH - 50, 60, 50, 10),
                // Barriers

                new Barrier(100,10,20,130),
                new Barrier(10,180,80,20),
                new Barrier(190,48,20,170),
                new Barrier(53,248,190,20),
                new Barrier(80,310,90,255),
                new Barrier(223,300,20,270),
                new Barrier(360,180,20,395),
                new Barrier(360,51,190,60),
                new Barrier(530,109,20,463),
                new Barrier(583 , 100,160,60),
                new Barrier(530,191,210,20),
                new Barrier(630,248,130,130),
                new Barrier(600,480,200,20),
                new Barrier(650,500,20,20),
                new Barrier(650,560,20,40),




        });
        for (Barrier barrier : level.getBarriers()) {
            barrier.setColor(new Color(190,152,214));
        }
        level.setStartGravity(new Vector(0, Game.getGravityPull()));
        level.setStartPos(new Vector(50, 550));
        level.setEndPos(new Vector(765, 570));
        level.setObjective(new Barrier(level.getEndPos(), 30, 30));
        level.getObjective().setColor(new Color(255,150,191));
        return level;
    }


}
