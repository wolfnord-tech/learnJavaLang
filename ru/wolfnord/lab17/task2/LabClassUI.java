package ru.wolfnord.lab17.task2;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class LabClassUI extends LabClassDriver {
    public static void main(String[] args) {
        LabClass labClass = new LabClass();

        LocalDate birthDate1 = LocalDate.of(2006, 1, 12);
        labClass.addStudent(new Student("Катя", "Котова", 88392, 6.4, "ABC-12", "5", "Russian Language", birthDate1));

        LocalDate birthDate2 = LocalDate.of(2077, 7, 29);
        labClass.addStudent(new Student("Андрей", "Смирнов", 34011, 3.0, "BCA-1", "5", "Computer Science", birthDate2));

        LocalDate birthDate3 = LocalDate.of(1995, 3, 15);
        labClass.addStudent(new Student("Кристина", "Кэт", 12490, 1.2, "AAC-23", "4", "Physics", birthDate3));

        Scanner scanner = new Scanner(System.in);
        Scanner choiceScan = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Меню выбора:
                    0) Выход
                    1) Сортировка студентов по среднему баллу
                    2) Поиск студента по имени""");
            int choice = Integer.parseInt(choiceScan.nextLine());

            switch (choice) {
                case 0:
                    return;
                case 1:
                    selectionSortByGPA(labClass.getStudents());
                    List<Student> sortedStudents = labClass.getStudents();
                    System.out.println("Сортировка по среднему баллу (GPA)");
                    for (Student student : sortedStudents) {
                        System.out.println(student);
                    }
                    break;

                case 2:
                    System.out.print("Введите имя студента: ");
                    String fullName = scanner.nextLine();
                    try {
                        // Поиск студента по ФИО
                        Student student = labClass.findStudentByFullName(fullName);
                        System.out.println("Найден студент " + student);
                    } catch (StudentNotFoundException | EmptyStringException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Команда не найдена!");
            }
        }
    }

    public static void selectionSortByGPA(List<Student> students) {
        int n = students.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (students.get(j).getGPA() < students.get(minIndex).getGPA()) {
                    minIndex = j;
                }
            }

            Student temp = students.get(i);
            students.set(i, students.get(minIndex));
            students.set(minIndex, temp);
        }
    }
}
