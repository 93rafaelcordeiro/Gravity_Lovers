package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.physics.Vector;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Objective extends GameObject{

    private int nextLevelNumber;

    public static final Color DEFAULT_OBJECTIVE_COLOR = new Color(255, 150, 191);

    public Objective(double x, double y, double width, double height) {
        super(x, y, width, height);
        this.setColor(DEFAULT_OBJECTIVE_COLOR);
    }

    public Objective(Vector position, double width, double height) {
        super(position, width, height);
        this.setColor(DEFAULT_OBJECTIVE_COLOR);
    }

    public Objective(double x, double y, double width, double height, int nextLevelNumber) {
        super(x, y, width, height);
        this.setColor(DEFAULT_OBJECTIVE_COLOR);
        this.nextLevelNumber = nextLevelNumber;
    }

    public Objective(Vector position, double width, double height, int nextLevelNumber) {
        super(position, width, height);
        this.setColor(DEFAULT_OBJECTIVE_COLOR);
        this.nextLevelNumber = nextLevelNumber;
    }

    public int getNextLevelNumber() {
        return nextLevelNumber;
    }

    public void setNextLevelNumber(int nextLevelNumber) {
        this.nextLevelNumber = nextLevelNumber;
    }
}
