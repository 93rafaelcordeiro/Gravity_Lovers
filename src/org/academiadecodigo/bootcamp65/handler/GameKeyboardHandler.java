package org.academiadecodigo.bootcamp65.handler;

import org.academiadecodigo.bootcamp65.Game;
import org.academiadecodigo.bootcamp65.Sound;
import org.academiadecodigo.bootcamp65.levels.LevelFactory;
import org.academiadecodigo.bootcamp65.levels.LevelType;
import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class GameKeyboardHandler implements KeyboardHandler {

    private Keyboard keyboard;
    private Game game;
    private Sound gravityleft;
    private Sound gravityup;
    private Sound gravityright;
    private Sound gravitydown;
    private Sound jump;

    public GameKeyboardHandler(Game game) throws IOException, UnsupportedAudioFileException {
        this.gravityleft = new Sound("resources/portal-phase .wav");
        this.gravityup = new Sound("resources/portal-phase .wav");
        this.gravityright = new Sound("resources/portal-phase .wav");
        this.gravitydown = new Sound("resources/portal-phase .wav");

        this.jump = new Sound("resources/cartoon-jumpwav-6462 (online-audio-converter.com).wav");
        this.keyboard = new Keyboard(this);
        this.game = game;
        addKey(KeyboardEvent.KEY_W);
        addKey(KeyboardEvent.KEY_A);
        addKey(KeyboardEvent.KEY_S);
        addKey(KeyboardEvent.KEY_D);
        addKey(KeyboardEvent.KEY_UP);
        addKey(KeyboardEvent.KEY_LEFT);
        addKey(KeyboardEvent.KEY_DOWN);
        addKey(KeyboardEvent.KEY_RIGHT);
        addKey(KeyboardEvent.KEY_R);
        addKey(KeyboardEvent.KEY_Q);
        addKey(KeyboardEvent.KEY_1);
        addKey(KeyboardEvent.KEY_2);
        addKey(KeyboardEvent.KEY_3);
        addKey(KeyboardEvent.KEY_4);
        addKey(KeyboardEvent.KEY_5);
        addKey(KeyboardEvent.KEY_6);
        addKey(KeyboardEvent.KEY_7);
        addKey(KeyboardEvent.KEY_8);
        addKey(KeyboardEvent.KEY_9);
        addKey(KeyboardEvent.KEY_0);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_W:
                System.out.println("Pressed W");
                if (this.game.getLevel().getLevelType() != LevelType.GRAVITY_CONTROL) {
                    jump.play(true);
                    this.game.getPlayer().addVelocity(new Vector(0, -game.getJumpVelocity()));
                }

                break;
            case KeyboardEvent.KEY_A:
                System.out.println("Pressed A");
                if (this.game.getLevel().getLevelType() != LevelType.GRAVITY_CONTROL) {
                    jump.play(true);
                    this.game.getPlayer().addVelocity(new Vector(-game.getJumpVelocity(), 0));
                }
                break;
            case KeyboardEvent.KEY_S:
                System.out.println("Pressed S");
                if (this.game.getLevel().getLevelType() != LevelType.GRAVITY_CONTROL) {
                    jump.play(true);
                    this.game.getPlayer().addVelocity(new Vector(0, game.getJumpVelocity()));
                }
                break;
            case KeyboardEvent.KEY_D:
                System.out.println("Pressed D");
                if (this.game.getLevel().getLevelType() != LevelType.GRAVITY_CONTROL) {
                    jump.play(true);
                    this.game.getPlayer().addVelocity(new Vector(game.getJumpVelocity(), 0));
                }
                break;
            case KeyboardEvent.KEY_UP:
                System.out.println("Pressed Up");
                if (this.game.getLevel().getLevelType() != LevelType.REGULAR_MOVEMENT) {
                    gravityup.play(true);
                    this.game.moveUp();
                }

                break;
            case KeyboardEvent.KEY_LEFT:
                System.out.println("Pressed Left");
                if (this.game.getLevel().getLevelType() != LevelType.REGULAR_MOVEMENT) {
                    gravityleft.play(true);
                    this.game.moveLeft();
                }
                break;
            case KeyboardEvent.KEY_DOWN:

                System.out.println("Pressed Down");
                if (this.game.getLevel().getLevelType() != LevelType.REGULAR_MOVEMENT) {
                    gravitydown.play(true);
                    this.game.moveDown();
                }
                break;
            case KeyboardEvent.KEY_RIGHT:

                System.out.println("Pressed Right");
                if (this.game.getLevel().getLevelType() != LevelType.REGULAR_MOVEMENT) {
                    gravityright.play(true);
                    this.game.moveRight();
                }
                break;
            case KeyboardEvent.KEY_R:
                System.out.println("Pressed R");
                this.game.changeLevel(LevelFactory.createLevel(this.game.getCurrentLevel()));
                break;
            case KeyboardEvent.KEY_Q:
                System.out.println("Pressed Q");
                this.game.changeLevel(LevelFactory.createLevel(0));
                this.game.restart();
                break;
            case KeyboardEvent.KEY_1:
                System.out.println("Pressed 1");
                this.game.changeLevel(LevelFactory.createLevel(1));
                break;
            case KeyboardEvent.KEY_2:
                System.out.println("Pressed 2");
                this.game.changeLevel(LevelFactory.createLevel(2));
                break;
            case KeyboardEvent.KEY_3:
                System.out.println("Pressed 3");
                this.game.changeLevel(LevelFactory.createLevel(3));
                break;
            case KeyboardEvent.KEY_4:
                System.out.println("Pressed 4");
                this.game.changeLevel(LevelFactory.createLevel(4));
                break;
            case KeyboardEvent.KEY_5:
                System.out.println("Pressed 5");
                this.game.changeLevel(LevelFactory.createLevel(5));
                break;
            case KeyboardEvent.KEY_6:
                System.out.println("Pressed 6");
                this.game.changeLevel(LevelFactory.createLevel(6));
                break;
            case KeyboardEvent.KEY_7:
                System.out.println("Pressed 7");
                this.game.changeLevel(LevelFactory.createLevel(7));
                break;
            case KeyboardEvent.KEY_8:
                System.out.println("Pressed 8");
                this.game.changeLevel(LevelFactory.createLevel(8));
                break;
            case KeyboardEvent.KEY_9:
                System.out.println("Pressed 9");
                this.game.changeLevel(LevelFactory.createLevel(9));
                break;
            case KeyboardEvent.KEY_0:
                System.out.println("Pressed 0");
                this.game.changeLevel(LevelFactory.createLevel(10));
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_W:
                System.out.println("Released W");
                break;
            case KeyboardEvent.KEY_A:
                System.out.println("Released A");
                break;
            case KeyboardEvent.KEY_S:
                System.out.println("Released S");
                break;
            case KeyboardEvent.KEY_D:
                System.out.println("Released D");
                break;
            case KeyboardEvent.KEY_UP:
                System.out.println("Released Up");
                break;
            case KeyboardEvent.KEY_LEFT:
                System.out.println("Released Left");
                break;
            case KeyboardEvent.KEY_DOWN:
                System.out.println("Released Down");
                break;
            case KeyboardEvent.KEY_RIGHT:
                System.out.println("Released Right");
                break;
        }
    }

    //region Add key
    public void addKey(int key) {
        addKeyPressed(key);
        addKeyReleased(key);
    }

    private void addKeyPressed(int key) {
        KeyboardEvent keyboardEvent = new KeyboardEvent();
        keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEvent.setKey(key);
        this.keyboard.addEventListener(keyboardEvent);
    }

    private void addKeyReleased(int key) {
        KeyboardEvent keyboardEvent = new KeyboardEvent();
        keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboardEvent.setKey(key);
        this.keyboard.addEventListener(keyboardEvent);
    }
    //endregion
}
