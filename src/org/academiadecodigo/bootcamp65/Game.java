package org.academiadecodigo.bootcamp65;

import org.academiadecodigo.bootcamp65.grid.Grid;
import org.academiadecodigo.bootcamp65.grid.GridFactory;
import org.academiadecodigo.bootcamp65.grid.GridType;
import org.academiadecodigo.bootcamp65.handler.GameKeyboardHandler;
import org.academiadecodigo.bootcamp65.levels.Level;
import org.academiadecodigo.bootcamp65.levels.LevelFactory;
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

        this.grid.init();

        gravityPull = .5;

        //level = LevelFactory.createLevel(LevelType.MAIN_MENU);
        this.level = LevelType.getLevel_1();

        this.gravity = new Vector(this.level.getStartGravity().getGravity());

        this.player = new Player(this.level.getStartPos(), 30, 30);
        this.player.setColor(new Color(150, 191, 255));

        this.directionLabel = this.level.getStartGravity().getLabel();
        this.direction = new Text(this.grid.getCols() - 22.5, 32.5, this.directionLabel);
        this.direction.grow(10, 10);
        this.direction.setColor(new Color(159, 152, 214));
        this.direction.draw();
    }

    public void start() throws InterruptedException {

        while (true) {
            drawLevel();
            drawPlayer();
            applyAcceleration();
            update();
            if (hasWon()) {
                level = LevelFactory.createLevel(0);
            }
            Thread.sleep(10);
        }
    }

    private boolean hasWon() {
        return false;
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

    public void restart() {
        this.player.setVelocity(new Vector(0, 0));
        this.player.setPosition(this.level.getStartPos());
        this.setGravity(this.level.getStartGravity().getGravity());
        this.direction.setText(this.level.getStartGravity().getLabel());
    }

    public void moveUp() {
        this.player.setVelocity(new Vector(0, 0));
        this.directionLabel = "↑";
        this.direction.setText(directionLabel);
        this.gravity = new Vector(0, -Game.getGravityPull());
    }

    public void moveLeft() {
        this.player.setVelocity(new Vector(0, 0));
        this.directionLabel = "←";
        this.direction.setText(directionLabel);
        this.gravity = new Vector(-Game.getGravityPull(), 0);
    }

    public void moveDown() {
        this.player.setVelocity(new Vector(0, 0));
        this.directionLabel = "↓";
        this.direction.setText(directionLabel);
        this.gravity = new Vector(0, Game.getGravityPull());
    }

    public void moveRight() {
        this.player.setVelocity(new Vector(0, 0));
        this.directionLabel = "→";
        this.direction.setText(directionLabel);
        this.gravity = new Vector(Game.getGravityPull(), 0);
    }

    public void changeLevel(Level level) {
        if (level != null) {
            this.level.delete();
            this.setLevel(level);
        }
        this.drawLevel();
        this.restart();
    }
}
