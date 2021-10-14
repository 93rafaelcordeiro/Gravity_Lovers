package org.academiadecodigo.bootcamp65;

import org.academiadecodigo.bootcamp65.handler.GameKeyboardHandler;
import org.academiadecodigo.bootcamp65.levels.Level;
import org.academiadecodigo.bootcamp65.levels.LevelFactory;
import org.academiadecodigo.bootcamp65.objects.Player;
import org.academiadecodigo.bootcamp65.physics.GravityDirectionType;
import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Game {

    public static final int GRID_WIDTH = 800;
    public static final int GRID_HEIGHT = 600;
    public static final int DELAY = 10;
    private Level level;
    private Player player;
    private Vector gravity;
    private Vector wind;
    private String directionLabel;
    private Text direction;
    private int currentLevel;
    private CollisionDetector collisionDetector;

    private static double gravityPull;
    private double jumpVelocity;

    public Game() {

    }

    public void init() {
        // Handler
        new GameKeyboardHandler(this);


        this.gravityPull = .5;
        this.jumpVelocity = 8;

        this.currentLevel = 1;
        this.level = LevelFactory.createLevel(this.currentLevel);
        this.collisionDetector = new CollisionDetector(this.level);

        this.gravity = new Vector(this.level.getStartGravity().getGravity());
        this.player = new Player(this.level.getStartPos(), 30, 30);

        this.directionLabel = this.level.getStartGravity().getLabel();
        this.direction = new Text(GRID_WIDTH - 22.5, 32.5, this.directionLabel);
        this.direction.grow(10, 10);
        this.direction.setColor(new Color(159, 152, 214));
        this.direction.draw();
    }

    public void start() throws InterruptedException {

        while (true) {
            if (this.player.isDead()) {
                player.getRectangle().setColor(new Color(213, 35, 47));
                this.player.setDead(false);
                Thread.sleep(500);
                restart();
            }
            drawLevel();
            drawPlayer();
            applyAcceleration();
            update();
            if (hasWon()) {
                Thread.sleep(1000);
                changeLevel(LevelFactory.createLevel(currentLevel + 1));
            }
            Thread.sleep(DELAY);
        }
    }

    private boolean hasWon() {
        return this.level.isCompleted();
    }

    //region Getters and Setters
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

    public double getJumpVelocity() {
        return jumpVelocity;
    }

    public void setJumpVelocity(double jumpVelocity) {
        this.jumpVelocity = jumpVelocity;
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
        this.collisionDetector.check(this.player);
        this.player.update(this.collisionDetector.check(this.player));
    }

    public void restart() {
        this.player.getRectangle().setColor(this.player.getColor());
        this.player.setVelocity(new Vector(0, 0));
        this.player.setPosition(this.level.getStartPos());
        this.setGravity(this.level.getStartGravity().getGravity());
        this.direction.setText(this.level.getStartGravity().getLabel());
    }

    public void moveUp() {
        this.player.setVelocity(new Vector(0, 0));
        this.direction.setText(GravityDirectionType.UP.getLabel());
        this.gravity = GravityDirectionType.UP.getGravity();
    }

    public void moveLeft() {
        this.player.setVelocity(new Vector(0, 0));
        this.direction.setText(GravityDirectionType.LEFT.getLabel());
        this.gravity = GravityDirectionType.LEFT.getGravity();
    }

    public void moveDown() {
        this.player.setVelocity(new Vector(0, 0));
        this.direction.setText(GravityDirectionType.DOWN.getLabel());
        this.gravity = GravityDirectionType.DOWN.getGravity();
    }

    public void moveRight() {
        this.player.setVelocity(new Vector(0, 0));
        this.direction.setText(GravityDirectionType.RIGHT.getLabel());
        this.gravity = GravityDirectionType.RIGHT.getGravity();
    }

    public void changeLevel(Level level) {
        this.level.delete();
        if (level != null) {
            this.setLevel(level);
        } else {
            level = LevelFactory.createLevel(1);
            this.setLevel(level);
        }
        this.collisionDetector.setLevel(this.level);
        this.drawLevel();
        this.restart();
    }
}
