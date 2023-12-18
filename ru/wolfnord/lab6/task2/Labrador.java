package ru.wolfnord.lab6.task2;

class Labrador extends Dog {
    public Labrador(int age) {
        super("Лабрадор", age);
    }

    @Override
    public void bark() {
        System.out.println("Лабрадор лает: Гав-гав-гав!");
    }
}
