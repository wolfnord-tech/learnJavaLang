package ru.wolfnord.lab21;

public class Main {
    public static void main(String[] args) {
        // Пример использования класса ArrayQueueModule
        ArrayQueueModule.create();
        ArrayQueueModule.enqueue("Элемент 1");
        ArrayQueueModule.enqueue("Элемент 2");
        System.out.println("Размер ArrayQueueModule: " + ArrayQueueModule.size());
        System.out.println("Первый элемент в ArrayQueueModule: " + ArrayQueueModule.element());
        System.out.println("Извлечение элемента из ArrayQueueModule: " + ArrayQueueModule.dequeue());
        System.out.println("Размер ArrayQueueModule после извлечения: " + ArrayQueueModule.size());
        System.out.println();

        // Пример использования класса ArrayQueueADT
        ArrayQueueADT queueADT = new ArrayQueueADT();
        ArrayQueueADT.create(queueADT);
        ArrayQueueADT.enqueue(queueADT, "Элемент 1");
        ArrayQueueADT.enqueue(queueADT, "Элемент 2");
        System.out.println("Размер ArrayQueueADT: " + ArrayQueueADT.size(queueADT));
        System.out.println("Первый элемент в ArrayQueueADT: " + ArrayQueueADT.element(queueADT));
        System.out.println("Извлечение элемента из ArrayQueueADT: " + ArrayQueueADT.dequeue(queueADT));
        System.out.println("Размер ArrayQueueADT после извлечения: " + ArrayQueueADT.size(queueADT));
        System.out.println();

        // Пример использования класса ArrayQueue
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue("Элемент 1");
        queue.enqueue("Элемент 2");
        System.out.println("Размер ArrayQueue: " + queue.size());
        System.out.println("Первый элемент в ArrayQueue: " + queue.element());
        System.out.println("Извлечение элемента из ArrayQueue: " + queue.dequeue());
        System.out.println("Размер ArrayQueue после извлечения: " + queue.size());
        System.out.println();

        // Пример использования класса LinkedQueue
        LinkedQueue linked_queue = new LinkedQueue();

        // Добавление элементов в очередь
        linked_queue.enqueue("Элемент 1");
        linked_queue.enqueue("Элемент 2");
        linked_queue.enqueue("Элемент 3");

        // Удаление и печать элементов из очереди
        while (!linked_queue.isEmpty()) {
            System.out.println(linked_queue.dequeue());
        }
    }
}
