package org.academiadecodigo.bootcamp65;

import org.academiadecodigo.bootcamp65.grid.Grid;
import org.academiadecodigo.bootcamp65.grid.GridFactory;
import org.academiadecodigo.bootcamp65.grid.GridType;
import org.academiadecodigo.bootcamp65.handler.GameKeyboardHandler;

public class Game {

    private Grid grid;

    public Game() {
        this.grid = GridFactory.makeGrid(GridType.SIMPLE_GFX,1200, 900);
    }

    public void init() {
        grid.init();

        new GameKeyboardHandler();
    }

    public void start() {

    }
}
