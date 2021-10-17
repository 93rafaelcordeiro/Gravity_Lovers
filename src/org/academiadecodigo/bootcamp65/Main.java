package org.academiadecodigo.bootcamp65;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException, UnsupportedAudioFileException {

        Game g = new Game();
        g.init();
        g.start();
    }
}
