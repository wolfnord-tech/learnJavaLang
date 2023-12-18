package ru.wolfnord.lab6.task2;

abstract class Dog {
    private String breed;
    private int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public abstract void bark();

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}