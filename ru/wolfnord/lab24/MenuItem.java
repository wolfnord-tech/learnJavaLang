package ru.wolfnord.lab24;

public class MenuItem implements Item {
    private double cost;
    private String name;

    public MenuItem(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    // Дополнительный метод getPrice
    public double getPrice() {
        return cost; // Возвращаем цену блюда
    }

    // Реализация методов интерфейса
    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return ""; // Пока описание не используется, можно вернуть пустую строку
    }
}
