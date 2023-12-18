package ru.wolfnord.lab22.task1;

public class Complex {
    private int real;
    private int image;

    public Complex() {
        this.real = 0;
        this.image = 0;
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
