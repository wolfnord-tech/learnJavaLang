package ru.wolfnord.lab4.task1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Длина: " + circle.getCircumference());
    }
}