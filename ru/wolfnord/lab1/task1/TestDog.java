package ru.wolfnord.lab1.task1;

import ru.wolfnord.lab1.task1.Dog;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 3, "Дворняга");

        System.out.println("Имя собаки: " + dog.getName());
        System.out.println("Возраст собаки: " + dog.getAge());
        System.out.println("Порода собаки: " + dog.getBreed());
    }
}
