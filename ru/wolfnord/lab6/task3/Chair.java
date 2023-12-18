package ru.wolfnord.lab6.task3;

class Chair extends Furniture {
    private int legs;

    public Chair(String material, int price, int legs) {
        super("Стул", material, price);
        this.legs = legs;
    }

    @Override
    public void use() {
        System.out.println("Использование стула...");
    }

    public int getLegs() {
        return legs;
    }
}