package org.academiadecodigo.bootcamp65;

import org.academiadecodigo.bootcamp65.grid.position.GridPosition;
import org.academiadecodigo.bootcamp65.objects.GameObject;

public class CollisionDetector {

    private Car[] cars;

    public CollisionDetector(Car[] cars) {
        this.cars = cars;
    }

    public boolean isUnSafe(GridPosition pos) {

        for (Car c : cars) {

            if (c.getPos() != pos && c.getPos().equals(pos)) {
                return true;
            }

        }

        return false;

    }

    public void check(GameObject gameObject) {

    }
}