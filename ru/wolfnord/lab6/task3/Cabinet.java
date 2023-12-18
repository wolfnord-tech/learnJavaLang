package ru.wolfnord.lab6.task3;

class Cabinet extends Furniture {
    private int shelves;

    public Cabinet(String material, int price, int shelves) {
        super("Шкаф", material, price);
        this.shelves = shelves;
    }

    @Override
    public void use() {
        System.out.println("Использование шкафа...");
    }

    public int getShelves() {
        return shelves;
    }
}