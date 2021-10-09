package org.academiadecodigo.bootcamp65.objects;

import org.academiadecodigo.bootcamp65.physics.Vector;

import javax.swing.text.Position;

public abstract class GameObject {

    private Vector position;
    private double width;
    private double height;

    public GameObject(double x, double y, double width, double height) {
        this.position = new Vector(x, y);
        this.width = width;
        this.height = height;
    }

    public GameObject(Vector position, double width, double height) {
        this.position = position;
        this.width = width;
        this.height = height;
    }
}
