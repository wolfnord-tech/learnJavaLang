package ru.wolfnord.lab6.task3;

abstract class Furniture {
    private String type;
    private String material;
    private int price;

    public Furniture(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public abstract void use();

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }
}
