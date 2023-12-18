package ru.wolfnord.lab23;

final public class Drink implements Item {
    private double price;
    private String name;
    private String description;

    private static final double DEFAULT_PRICE = 0.0;

    public Drink(String name, String describtion) {
        this.price = DEFAULT_PRICE;
        this.name = name;
        this.description = describtion;
    }

    public Drink(double price, String name, String describtion) {
        this.price = price;
        this.name = name;
        this.description = describtion;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
