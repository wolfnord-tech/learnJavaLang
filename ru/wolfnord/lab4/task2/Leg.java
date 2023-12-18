package ru.wolfnord.lab4.task2;

public class Leg {
    private int length;
    private String side;

    public Leg(int length, String side) {
        this.length = length;
        this.side = side;
    }

    public int getLength() {
        return length;
    }

    public String getSide() {
        return side;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Leg {" +
                "length=" + length +
                ", side='" + side + '\'' +
                '}';
    }
}
