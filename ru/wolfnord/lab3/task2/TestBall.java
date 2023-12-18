package ru.wolfnord.lab3.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(3.0, 4.0);

        System.out.println(ball);

        ball.move(1.0, 2.0);

        System.out.println(ball);

        double x = ball.getX();
        System.out.println("Координата X: " + x);

        double y = ball.getY();
        System.out.println("Координата Y: " + y);

        ball.setX(5.0);
        System.out.println("Новая координата X: " + ball.getX());
        ball.setY(6.0);
        System.out.println("Новая координата Y: " + ball.getY());
        ball.setXY(7.0, 8.0);
        System.out.println("Новые координаты (X, Y): (" + ball.getX() + ", " + ball.getY() + ")");
        ball.move(1, 2);
        System.out.println("Новые координаты (X, Y): (" + ball.getX() + ", " + ball.getY() + ")");
    }
}

