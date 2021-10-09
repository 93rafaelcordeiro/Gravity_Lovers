package org.academiadecodigo.bootcamp65.gfx;

import org.academiadecodigo.bootcamp65.grid.GridColor;
import org.academiadecodigo.bootcamp65.grid.GridDirection;
import org.academiadecodigo.bootcamp65.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp65.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;

    /**
     * Simple graphics position constructor
     *
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid) {
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);
        this.simpleGfxGrid = grid;
        this.rectangle = new Rectangle(getCol() * SimpleGfxGrid.CELL_SIZE + SimpleGfxGrid.PADDING, getRow() * SimpleGfxGrid.CELL_SIZE + SimpleGfxGrid.PADDING, SimpleGfxGrid.CELL_SIZE, SimpleGfxGrid.CELL_SIZE);
        this.rectangle.fill();
    }

    /**
     * Simple graphics position constructor
     *
     * @param col  position column
     * @param row  position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid) {
        super(col, row, grid);
        this.simpleGfxGrid = grid;
        this.rectangle = new Rectangle(getCol() * SimpleGfxGrid.CELL_SIZE + SimpleGfxGrid.PADDING, getRow() * SimpleGfxGrid.CELL_SIZE + SimpleGfxGrid.PADDING, SimpleGfxGrid.CELL_SIZE, SimpleGfxGrid.CELL_SIZE);
        this.rectangle.fill();
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        this.rectangle.fill();
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        this.rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {

        int initialCol = getCol();
        int initialRow = getRow();

        super.moveInDirection(direction, distance);

        int x = simpleGfxGrid.columnToX(getCol()) - simpleGfxGrid.columnToX(initialCol);
        int y = simpleGfxGrid.rowToY(getRow()) - simpleGfxGrid.rowToY(initialRow);

        rectangle.translate(x, y);
    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        super.setColor(color);
        this.rectangle.setColor(SimpleGfxColorMapper.getColor(color));
    }
}
