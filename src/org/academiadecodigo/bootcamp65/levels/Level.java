package org.academiadecodigo.bootcamp65.levels;

import org.academiadecodigo.bootcamp65.objects.Barrier;
import org.academiadecodigo.bootcamp65.objects.Destination;

public class Level {

    private Barrier[] barriers;
    private Destination destination;

    public Level(Barrier[] barriers) {
        this.barriers = barriers;
    }
}
