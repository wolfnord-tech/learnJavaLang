package ru.wolfnord.lab19;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] array = {1, "two", 3.0, true};
        ArrayToListConverter converter = new ArrayToListConverter(array);

        Object element = converter.getElementAtIndex(2);
        System.out.println("Элемент под номером 2: " + element);

        String[] directoryContents = {"1", "2", "3", "4", "5", "6"};
        List<Object> list = converter.convertDirectoryToList(directoryContents);
        System.out.println("Первые пять элементов списка:");
        converter.printFirstFiveElements(list);
    }
}


