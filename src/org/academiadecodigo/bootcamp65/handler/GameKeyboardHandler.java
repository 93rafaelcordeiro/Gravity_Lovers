package org.academiadecodigo.bootcamp65.handler;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class GameKeyboardHandler implements KeyboardHandler {

    private Keyboard keyboard;

    public GameKeyboardHandler() {
        this.keyboard = new Keyboard(this);
        addKey(KeyboardEvent.KEY_W);
        addKey(KeyboardEvent.KEY_A);
        addKey(KeyboardEvent.KEY_S);
        addKey(KeyboardEvent.KEY_D);
        addKey(KeyboardEvent.KEY_UP);
        addKey(KeyboardEvent.KEY_LEFT);
        addKey(KeyboardEvent.KEY_DOWN);
        addKey(KeyboardEvent.KEY_RIGHT);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_W:
                System.out.println("Pressed W");
                break;
            case KeyboardEvent.KEY_A:
                System.out.println("Pressed A");
                break;
            case KeyboardEvent.KEY_S:
                System.out.println("Pressed S");
                break;
            case KeyboardEvent.KEY_D:
                System.out.println("Pressed D");
                break;
            case KeyboardEvent.KEY_UP:
                System.out.println("Pressed Up");
                break;
            case KeyboardEvent.KEY_LEFT:
                System.out.println("Pressed Left");
                break;
            case KeyboardEvent.KEY_DOWN:
                System.out.println("Pressed Down");
                break;
            case KeyboardEvent.KEY_RIGHT:
                System.out.println("Pressed Right");
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
