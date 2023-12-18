package ru.wolfnord.lab5.type2;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }


    public void moveUp() {
        x += xSpeed;
    }


    public void moveDown() {
        x -= xSpeed;
    }


    public void moveLeft() {
        y -= ySpeed;
    }


    public void moveRight() {
        y += ySpeed;
    }
}

