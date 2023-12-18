package ru.wolfnord.lab11;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        LocalDate birthDate1 = LocalDate.of(2006, 1, 12);
        Student student1 = new Student("Катя", "Котова", 88392, 6.4, "ABC-12", "5", "Russian Language", birthDate1);

        LocalDate birthDate2 = LocalDate.of(2077, 7, 29);
        Student student2 = new Student("Андрей", "Смирнов", 34011, 3.0, "BCA-1", "5", "Computer Science", birthDate2);

        LocalDate birthDate3 = LocalDate.of(1995, 3, 15);
        Student student3 = new Student("Кристина", "Кэт", 12490, 1.2, "AAC-23", "4", "Physics", birthDate3);

        LocalDate birthDate4 = LocalDate.of(2000, 7, 1);
        Student student4 = new Student("Глеб", "Викторов", 82291, 2.7, "CEE-14", "2", "Arts", birthDate4);
        LocalDate birthDate5 = LocalDate.of(2001, 12, 30);
        Student student5 = new Student("Виктор", "Алексеев", 13311, 16.0, "CCB-19", "1", "3D specialist", birthDate5);

        list1.add(student1);
        list1.add(student2);
        list2.add(student3);
        list2.add(student4);
        list2.add(student5);

        // Сортировка списков
        insertionSortById(list1);
        quickSort(list2, 0, list2.size()-1);

        System.out.println("Сортировка по ID вставками");
        for (Student student : list1) {
            System.out.println(student);
        }

        System.out.println("\nСортировка по GPA быстрой сортировкой");
        for (Student student : list2) {
            System.out.println(student);
        }

        List<Student> mergedList = mergeSortedLists(list1, list2);

        System.out.println("\nСортировка объединенного и отсортированного списка с использованием сортировки слиянием");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }

    public static void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex-1);
            quickSort(students, pivotIndex+1, high);
        }
    }

    private static int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low-1;

        for (int j=low; j<high; j++) {
            if (students.get(j).compareTo(pivot) <= 0) {
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        Student temp = students.get(i+1);
        students.set(i+1, students.get(high));
        students.set(high, temp);

        return i+1;
    }

    public static void insertionSortById(List<Student> students) {
        int n = students.size();
        for (int i = 1; i < n; i++) {
            Student key = students.get(i);
            int j = i - 1;
            while (j >= 0 && students.get(j).getID() > key.getID()) {
                students.set(j + 1, students.get(j));
                j = j - 1;
            }
            students.set(j + 1, key);
        }
    }
    public static List<Student> mergeSortedLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).compareTo(list2.get(j)) >= 0) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}