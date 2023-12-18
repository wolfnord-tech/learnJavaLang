package ru.wolfnord.lab14;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        if (content.contains(element)) {
            content.remove(element);
            content.add(element);
        }
    }
}

