package ru.wolfnord.lab6.task2;

class Husky extends Dog {
    public Husky(int age) {
        super("Хаски", age);
    }

    @Override
    public void bark() {
        System.out.println("Хаски лает: Гав-гав!");
    }
}

