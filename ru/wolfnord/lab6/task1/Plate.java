package ru.wolfnord.lab6.task1;

class Plate extends Dish {
    private boolean isDivided;

    public Plate(String material, int capacity, boolean isDivided) {
        super(material, capacity);
        this.isDivided = isDivided;
    }

    @Override
    public void use() {
        System.out.println("Использование тарелки...");
    }

    public boolean isDivided() {
        return isDivided;
    }
}