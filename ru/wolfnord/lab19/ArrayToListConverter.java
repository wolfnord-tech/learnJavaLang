package ru.wolfnord.lab19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayToListConverter {
    private final Object[] array;

    public List<Object> convertDirectoryToList(String[] directoryContents) {
        List<Object> list = new ArrayList<>();
        Collections.addAll(list, directoryContents);
        return list;
    }

    public ArrayToListConverter(Object[] array) {
        this.array = array;
    }

    public void printFirstFiveElements(List<Object> list) {
        for (int i = 0; i < 5 && i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public Object getElementAtIndex(int index) {
        return array[index];
    }
}
