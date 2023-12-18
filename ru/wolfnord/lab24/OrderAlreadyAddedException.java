package ru.wolfnord.lab24;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(String message) {
        super(message);
    }
}
