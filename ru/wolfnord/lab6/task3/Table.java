package ru.wolfnord.lab6.task3;

class Table extends Furniture {
    private int seats;

    public Table(String material, int price, int seats) {
        super("Стол", material, price);
        this.seats = seats;
    }

    @Override
    public void use() {
        System.out.println("Использование стола...");
    }

    public int getSeats() {
        return seats;
    }
}
