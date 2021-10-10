package org.academiadecodigo.bootcamp65;

import org.academiadecodigo.bootcamp65.grid.Grid;
import org.academiadecodigo.bootcamp65.grid.GridFactory;
import org.academiadecodigo.bootcamp65.grid.GridType;
import org.academiadecodigo.bootcamp65.handler.GameKeyboardHandler;
import org.academiadecodigo.bootcamp65.levels.Level;
import org.academiadecodigo.bootcamp65.levels.LevelFactory;

public class Game {

    private Grid grid;
    private Level level;

    public Game() {
        this.grid = GridFactory.makeGrid(GridType.SIMPLE_GFX,1200, 900);
    }

    public void init() {
        grid.init();
        level = LevelFactory.createLevel(1);

        new GameKeyboardHandler();
    }

    public void start() {


    }

    public void drawLevel() {
        this.level.show();
    }
}
