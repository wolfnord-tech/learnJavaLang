package ru.wolfnord.lab5.type1;

public class Circle extends Shape {

    protected double radius;

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle() {
        super();
        radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }


    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
}

