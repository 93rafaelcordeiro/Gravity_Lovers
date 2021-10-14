package org.academiadecodigo.bootcamp65;

import org.academiadecodigo.bootcamp65.grid.Grid;
import org.academiadecodigo.bootcamp65.grid.GridFactory;
import org.academiadecodigo.bootcamp65.grid.GridType;
import org.academiadecodigo.bootcamp65.handler.GameKeyboardHandler;
import org.academiadecodigo.bootcamp65.levels.Level;
import org.academiadecodigo.bootcamp65.levels.LevelType;
import org.academiadecodigo.bootcamp65.objects.Player;
import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Game {

    public static final int GRID_WIDTH = 800;
    public static final int GRID_HEIGHT = 600;
    private Grid grid;
    private Level level;
    private Player player;
    private Vector gravity;
    private Vector wind;
    private String directionLabel;
    private Text direction;

    private static double gravityPull;

    public Game() {
        this.grid = GridFactory.makeGrid(GridType.SIMPLE_GFX, GRID_WIDTH, GRID_HEIGHT);
    }

    public void init() {
        // Handler
        new GameKeyboardHandler(this);

        grid.init();

        //level = LevelFactory.createLevel(1);
        this.gravityPull = .5;
        this.gravity = new Vector(0, this.gravityPull);

        this.level = LevelType.getLevel_4();

        this.player = new Player(50, 50, 30, 30);
        this.player.setPosition(this.level.getStartPos());
        this.player.setColor(new Color(150,191,255));

        this.directionLabel = "↓";
        this.direction = new Text(this.grid.getCols() - 22.5, 32.5, this.directionLabel);
        this.direction.grow(10, 10);
        this.direction.setColor(new Color(159,152,214));
        this.direction.draw();
    }

    public void start() throws InterruptedException {

        while (true) {
            //System.out.println("Pos: " + this.player.getPosition().getX() + ":" + this.player.getPosition().getY());
            drawLevel();
            drawPlayer();
            applyAcceleration();
            update();


            Thread.sleep(10);
        }
    }

    //region Getters and Setters
    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public static double getGravityPull() {
        return gravityPull;
    }

    public void setGravityPull(double gravityPull) {
        this.gravityPull = gravityPull;
    }

    public Vector getGravity() {
        return gravity;
    }

    public void setGravity(Vector gravity) {
        this.gravity = gravity;
    }

    public Vector getWind() {
        return wind;
    }

    public void setWind(Vector wind) {
        this.wind = wind;
    }

    public String getDirectionLabel() {
        return directionLabel;
    }

    public void setDirectionLabel(String directionLabel) {
        this.directionLabel = directionLabel;
    }

    public Text getDirection() {
        return direction;
    }

    public void setDirection(Text direction) {
        this.direction = direction;
    }

    //endregion

    public void drawLevel() {
        this.direction.delete();
        this.direction.draw();
        this.level.show();
    }

    public void drawPlayer() {
        this.player.show();
    }

    public void applyAcceleration() {
        this.player.addAcceleration(this.gravity);
    }

    public void update() {
        this.player.update(level);
    }
}
