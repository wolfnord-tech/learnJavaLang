package ru.wolfnord.lab6.task1;

abstract class Dish {
    private String material;
    private int capacity;

    public Dish(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    public abstract void use();

    public String getMaterial() {
        return material;
    }

    public int getCapacity() {
        return capacity;
    }
}

