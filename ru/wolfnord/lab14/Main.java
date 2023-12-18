package ru.wolfnord.lab14;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание списка ожидания
        WaitList<Integer> waitList = new WaitList<>();

        // Добавление элементов в список ожидания
        waitList.add(1);
        waitList.add(2);
        waitList.add(3);

        // Удаление элемента из списка ожидания
        int removedElement = waitList.remove();
        System.out.println("Удаленный элемент: " + removedElement);

        // Проверка, содержит ли список ожидания коллекцию
        boolean containsCollection = waitList.contains(3);
        System.out.println("Содержит коллекцию: " + containsCollection);

        // Проверка, содержит ли список ожидания все элементы из коллекции
        boolean containsAllCollection = waitList.containsAll(List.of(2, 3, 4));
        System.out.println("Содержит все элементы коллекции: " + containsAllCollection);

        // Проверка, пустой ли список ожидания
        boolean isEmpty = waitList.isEmpty();
        System.out.println("Пустой ли список: " + isEmpty);

        // Создание ограниченного списка ожидания с вместимостью 5
        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(5);

        // Добавление элементов в ограниченный список ожидания
        boundedWaitList.add("яблоко");
        boundedWaitList.add("банан");
        boundedWaitList.add("вишня");

        // Проверка вместимости ограниченного списка ожидания
        int capacity = boundedWaitList.getCapacity();
        System.out.println("Вместимость: " + capacity);

        // Создание списка ожидания с неправильным порядком элементов
        UnfairWaitList<Character> unfairWaitList = new UnfairWaitList<>();

        // Добавление элементов в список ожидания с неправильным порядком
        unfairWaitList.add('А');
        unfairWaitList.add('Б');
        unfairWaitList.add('В');

        // Удаление элемента из списка ожидания
        unfairWaitList.remove('Б');

        // Перемещение элемента в конец списка ожидания
        unfairWaitList.moveToBack('А');

        // Вывод списков ожидания
        System.out.println("Список ожидания: " + waitList);
        System.out.println("Ограниченный список ожидания: " + boundedWaitList);
        System.out.println("Список ожидания с неправильным порядком: " + unfairWaitList);
    }
}

