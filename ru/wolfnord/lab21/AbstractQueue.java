package ru.wolfnord.lab21;

public abstract class AbstractQueue implements Queue {
    protected Object[] queue;
    protected int size;
    protected int front;
    protected int rear;
}

