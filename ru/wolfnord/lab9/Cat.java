package ru.wolfnord.lab9;

public class Cat implements Nameable {
    String name;
    @Override
    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
    }
}
