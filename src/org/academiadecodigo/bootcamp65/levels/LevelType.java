package org.academiadecodigo.bootcamp65.levels;

import org.academiadecodigo.bootcamp65.Game;
import org.academiadecodigo.bootcamp65.objects.Barrier;

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
                new Barrier(400, 300, 10, 300),
                new Barrier(10, 500, 300, 10),


                new Barrier(120, 120, 100, 20),
                new Barrier(120, 120, 100, 20),
                new Barrier(120, 120, 100, 20)
        });
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
                new Barrier(Game.GRID_WIDTH - 50, 60, 50, 10)
                // Barriers

        });
        return level;
    }





}
