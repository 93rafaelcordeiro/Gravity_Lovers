package org.academiadecodigo.bootcamp65;

import org.academiadecodigo.bootcamp65.handler.GameKeyboardHandler;
import org.academiadecodigo.bootcamp65.levels.Level;
import org.academiadecodigo.bootcamp65.levels.LevelFactory;
import org.academiadecodigo.bootcamp65.objects.Block;
import org.academiadecodigo.bootcamp65.objects.Player;
import org.academiadecodigo.bootcamp65.physics.CollisionDetector;
import org.academiadecodigo.bootcamp65.physics.GravityDirectionType;
import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Iterator;

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

    private Sound backgroundMusic;
    private Sound woman;
    private Sound pornhub;
    private Sound beerSound;


    public Game() {
        this.backgroundMusic = new Sound("/resources/background-music.wav");
        this.woman = new Sound("/resources/moan.wav");
        this.pornhub = new Sound("/resources/pornhub.wav");
        this.beerSound = new Sound("/resources/beer-sound.wav");
    }

    public void init() {
        // Handler
        new GameKeyboardHandler(this);


        this.gravityPull = .5;
        this.jumpVelocity = 8;

        this.currentLevel = 0;
        this.level = LevelFactory.createLevel(this.currentLevel);
        this.collisionDetector = new CollisionDetector(this);

        this.gravity = new Vector(this.level.getStartGravity().getGravity());
        this.player = new Player(this.level.getStartPos(), 30, 30);
        this.player.setPicture(new Picture(this.level.getStartPos().getX(), this.level.getStartPos().getY(), "resources/baljeet.png"));

        this.directionLabel = this.level.getStartGravity().getLabel();
        this.direction = new Text(GRID_WIDTH - 22.5, 32.5, this.directionLabel);
        this.direction.grow(10, 10);
        this.direction.setColor(new Color(159, 152, 214));
        this.direction.draw();
    }

    public void start() throws InterruptedException {
        this.backgroundMusic.play(true);
        this.backgroundMusic.setLoop(1000);
        while (true) {
            if (this.player.isDead()) {
                player.getRectangle().setColor(new Color(213, 35, 47));
                this.player.setDead(false);
                Thread.sleep(500);
                changeLevel(LevelFactory.createLevel(this.level.getLevelNumber()));
            }
            drawLevel();
            drawPlayer();
            applyAcceleration();
            update();
            if (hasWon()) {
                Thread.sleep(1000);
                changeLevel(LevelFactory.createLevel(this.level.getNextLevelNumber()));
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

    public int getCurrentLevel() {
        return currentLevel;
    }

    public Sound getWoman() {
        return woman;
    }

    public void setWoman(Sound woman) {
        this.woman = woman;
    }

    public Sound getBeerSound() {
        return beerSound;
    }

    public void setBeerSound(Sound beerSound) {
        this.beerSound = beerSound;
    }

    //endregion

    //region Gravity Control
    public void fallUp() {
        //this.player.setVelocity(new Vector(0, 0));
        this.direction.setText(GravityDirectionType.UP.getLabel());
        this.gravity = GravityDirectionType.UP.getGravity();
    }

    public void fallLeft() {
        //this.player.setVelocity(new Vector(0, 0));
        this.direction.setText(GravityDirectionType.LEFT.getLabel());
        this.gravity = GravityDirectionType.LEFT.getGravity();
    }

    public void fallDown() {
        //this.player.setVelocity(new Vector(0, 0));
        this.direction.setText(GravityDirectionType.DOWN.getLabel());
        this.gravity = GravityDirectionType.DOWN.getGravity();
    }

    public void fallRight() {
        //this.player.setVelocity(new Vector(0, 0));
        this.direction.setText(GravityDirectionType.RIGHT.getLabel());
        this.gravity = GravityDirectionType.RIGHT.getGravity();
    }
    //endregion

    public void drawLevel() {
        this.direction.delete();
        this.direction.draw();
        this.level.show();
    }

    public void drawPlayer() {
        this.player.delete();
        this.player.show();
    }

    public void applyAcceleration() {
        this.player.addAcceleration(this.gravity);
    }

    public void update() {
        this.player.update(this.collisionDetector.check(this.player));
        if (level.getRequirements() != null && level.getRequirements().size() != 0) {
            Iterator<Block> it = level.getRequirements().iterator();
            while (it.hasNext()) {
                Block requirement = it.next();
                if (requirement.isDestroyed()) {
                    it.remove();
                }
            }
        }

        if (level.getRequirements() != null && level.getRequirements().size() == 0) {
            Iterator<Block> it = level.getWalls().iterator();
            while (it.hasNext()) {
                Block wall = it.next();
                if (wall.isDestroyable()) {
                    wall.delete();
                    it.remove();
                }
            }
        }
    }

    public void restart() {
        this.player.getRectangle().setColor(this.player.getColor());
        this.player.setVelocity(new Vector(0, 0));
        this.player.setPosition(this.level.getStartPos());

        this.direction.setText(this.level.getStartGravity().getLabel());
        this.setGravity(this.level.getStartGravity().getGravity());
    }

    public void changeLevel(Level level) {
        this.level.delete();
        this.level = null;
        if (level == null) {
            level = LevelFactory.createLevel(0);
        }
        this.setLevel(level);
        this.currentLevel = level.getNumber();
        this.drawLevel();
        this.restart();
        this.pornhub.play(true);
    }
}
