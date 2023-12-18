package ru.wolfnord.lab21;

public interface Queue {
    void enqueue(Object element);
    Object dequeue();
    Object element();
    int size();
    boolean isEmpty();
    void clear();
}

