package ru.wolfnord.lab1.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball("Красный", 5.0);

        System.out.println("Цвет мяча: " + ball.getColor());
        System.out.println("Радиус мяча: " + ball.getRadius());
    }
}
