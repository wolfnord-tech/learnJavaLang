package ru.wolfnord.lab24;

public class Dish implements Item {
    private final double cost;
    private final String name;
    private final String description;

    public Dish(double cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
