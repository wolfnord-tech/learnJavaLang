package ru.wolfnord.lab6.task2;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Husky(3);
        Dog dog2 = new Labrador(5);

        dog1.bark();
        dog2.bark();

        System.out.println("Порода собаки: " + dog1.getBreed());
        System.out.println("Возраст собаки: " + dog1.getAge());

        System.out.println("Порода собаки: " + dog2.getBreed());
        System.out.println("Возраст собаки: " + dog2.getAge());
    }
}