package org.academiadecodigo.bootcamp65.gfx;

import org.academiadecodigo.bootcamp65.grid.Grid;
import org.academiadecodigo.bootcamp65.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;
    private int cols;
    private int rows;
    public static final int CELL_SIZE = 1;
    private Rectangle background;
    private SimpleGfxGridPosition[] positions;

    public SimpleGfxGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    /**
     * @see Grid#init()
     */
    @Override
    public void init() {
        this.background = new Rectangle(PADDING, PADDING, this.cols * CELL_SIZE, this.rows * CELL_SIZE);
        this.background.draw();
    }

    /**
     * @see Grid#getCols()
     */
    @Override
    public int getCols() {
        return this.cols;
    }

    /**
     * @see Grid#getRows()
     */
    @Override
    public int getRows() {
        return this.rows;
    }

    /**
     * Obtains the width of the grid in pixels
     *
     * @return the width of the grid
     */
    public int getWidth() {
        return this.background.getWidth();
    }

    /**
     * Obtains the height of the grid in pixels
     *
     * @return the height of the grid
     */
    public int getHeight() {
        return this.background.getHeight();
    }

    /**
     * Obtains the grid X position in the SimpleGFX canvas
     *
     * @return the x position of the grid
     */
    public int getX() {
        return this.background.getX();
    }

    /**
     * Obtains the grid Y position in the SimpleGFX canvas
     *
     * @return the y position of the grid
     */
    public int getY() {
        return this.background.getY();
    }

    /**
     * Obtains the pixel width and height of a grid position
     *
     * @return
     */
    public int getCellSize() {
        return this.CELL_SIZE;
    }

    /**
     * @see Grid#makeGridPosition()
     */
    @Override
    public GridPosition makeGridPosition() {
        return new SimpleGfxGridPosition(this);
    }

    /**
     * @see Grid#makeGridPosition(int, int)
     */
    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return new SimpleGfxGridPosition(col, row, this);
    }

    /**
     * Auxiliary method to compute the y value that corresponds to a specific row
     *
     * @param row index
     * @return y pixel value
     */
    public int rowToY(int row) {
        return row * CELL_SIZE + PADDING;
    }

    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     *
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) {
        return column * CELL_SIZE + PADDING;
    }




}
