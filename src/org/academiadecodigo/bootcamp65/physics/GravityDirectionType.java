package org.academiadecodigo.bootcamp65.physics;

import org.academiadecodigo.bootcamp65.Game;

public enum GravityDirectionType {
    UP("↑", new Vector(0, -Game.getGravityPull())),
    LEFT("←", new Vector(-Game.getGravityPull(), 0)),
    DOWN("↓", new Vector(0, Game.getGravityPull())),
    RIGHT("→", new Vector(Game.getGravityPull(), 0));

    private String label;
    private Vector gravity;

    GravityDirectionType(String label, Vector gravity) {
        this.label = label;
        this.gravity = gravity;
    }

    public String getLabel() {
        return label;
    }

    public Vector getGravity() {
        return gravity;
    }
}
