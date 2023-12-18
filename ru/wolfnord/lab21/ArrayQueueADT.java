package ru.wolfnord.lab21;

// Класс ArrayQueueADT реализует очередь в виде абстрактного типа данных
public class ArrayQueueADT {
    private Object[] queue;
    private int size;
    private int front;
    private int rear;

    // Создание новой очереди
    public static void create(ArrayQueueADT queueADT) {
        queueADT.queue = new Object[10];
        queueADT.size = 0;
        queueADT.front = 0;
        queueADT.rear = -1;
    }

    // Добавление элемента в конец очереди
    public static void enqueue(ArrayQueueADT queueADT, Object element) {
        if (queueADT.size == queueADT.queue.length) {
            expandQueue(queueADT);
        }
        queueADT.rear = (queueADT.rear + 1) % queueADT.queue.length;
        queueADT.queue[queueADT.rear] = element;
        queueADT.size++;
    }

    // Получение первого элемента в очереди
    public static Object element(ArrayQueueADT queueADT) {
        if (isEmpty(queueADT)) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueADT.queue[queueADT.front];
    }

    // Удаление и возвращение первого элемента в очереди
    public static Object dequeue(ArrayQueueADT queueADT) {
        if (isEmpty(queueADT)) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = queueADT.queue[queueADT.front];
        queueADT.queue[queueADT.front] = null;
        queueADT.front = (queueADT.front + 1) % queueADT.queue.length;
        queueADT.size--;
        return element;
    }

    // Получение текущего размера очереди
    public static int size(ArrayQueueADT queueADT) {
        return queueADT.size;
    }

    // Проверка, является ли очередь пустой
    public static boolean isEmpty(ArrayQueueADT queueADT) {
        return queueADT.size == 0;
    }

    // Удаление всех элементов из очереди
    public static void clear(ArrayQueueADT queueADT) {
        queueADT.queue = new Object[10];
        queueADT.size = 0;
        queueADT.front = 0;
        queueADT.rear = -1;
    }

    // Увеличение размера массива очереди
    private static void expandQueue(ArrayQueueADT queueADT) {
        Object[] newQueue = new Object[queueADT.queue.length * 2];
        int index = queueADT.front;
        for (int i = 0; i < queueADT.size; i++) {
            newQueue[i] = queueADT.queue[index];
            index = (index + 1) % queueADT.queue.length;
        }
        queueADT.queue = newQueue;
        queueADT.front = 0;
        queueADT.rear = queueADT.size - 1;
    }
}

// Инвариант:
// - front и rear - индексы первого и последнего элементов в очереди (пустая очередь: front = 0, rear = -1)
// - size - текущий размер очереди
// - queue - массив элементов очереди

// Предусловие функций:
// - create: отсутствуют
// - enqueue: element != null
// - element, dequeue: очередь не пуста (size > 0)
// - size, isEmpty, clear: отсутствуют

// Постусловие функций:
// - create: очередь создана (front = 0, rear = -1, size = 0)
// - enqueue: элемент добавлен в конец очереди (size увеличено на 1, rear обновлен)
// - element: возвращен первый элемент очереди
// - dequeue: первый элемент удален и возвращен (size уменьшено на 1, front обновлен)
// - size: возвращен текущий размер очереди
// - isEmpty: возвращено true, если очередь пуста (size = 0), иначе false
// - clear: очередь удалена (front = 0, rear = -1, size = 0)