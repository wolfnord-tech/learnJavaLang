package ru.wolfnord.lab9;

public class Labtop implements Nameable {
    String name;
    @Override
    public String getName() {
        return name;
    }

    public Labtop(String name) {
        this.name = name;
    }
}
