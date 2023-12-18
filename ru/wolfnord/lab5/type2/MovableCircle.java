package ru.wolfnord.lab5.type2;

public class MovableCircle implements Movable {

    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }


    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center.toString() +
                '}';
    }


    public void moveUp() {
        center.moveUp();
    }


    public void moveDown() {
        center.moveDown();
    }


    public void moveLeft() {
        center.moveLeft();
    }


    public void moveRight() {
        center.moveRight();
    }
}
