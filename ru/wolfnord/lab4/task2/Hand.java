package ru.wolfnord.lab4.task2;

public class Hand {
    private int length;
    private String side;

    public Hand(int length, String side) {
        this.length = length;
        this.side = side;
    }

    public int getLength() {
        return length;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hand {" +
                "length=" + length +
                ", side='" + side + '\'' +
                '}';
    }
}
