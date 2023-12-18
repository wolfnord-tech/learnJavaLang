package ru.wolfnord.lab18;

import java.io.Serializable;

class Animal implements Serializable {

}

public record Main<T extends Comparable<T>, V extends Animal & Serializable, K>(T t, V v, K k) {

    public void printClassNames() {
        System.out.println("Type of T: " + t.getClass().getName());
        System.out.println("Type of V: " + v.getClass().getName());
        System.out.println("Type of K: " + k.getClass().getName());
    }

    public static void main(String[] args) {
        Main<Integer, Animal, String> myObject = new Main<>(42, new Animal(), "Example");
        myObject.printClassNames();
    }
}