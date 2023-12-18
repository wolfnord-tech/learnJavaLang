package ru.wolfnord.lab6.task3;

class FurnitureShop {
    private String name;

    public FurnitureShop(String name) {
        this.name = name;
    }

    public void sellFurniture(Furniture furniture) {
        System.out.println("Продажа " + furniture.getType() + " в магазине " + name);
    }
}