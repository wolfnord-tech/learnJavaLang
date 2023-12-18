package ru.wolfnord.lab5.type1;

public class Rectangle extends Shape {

    protected double width, length;

    public Rectangle() {
        super();
        length = 0;
        width = 0;
    }

    public Rectangle(double width, double length, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double getArea() {
        return width * length;
    }


    public double getPerimeter() {
        return 2 * (width + length);
    }


    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", colour='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

