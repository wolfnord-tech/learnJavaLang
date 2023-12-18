package ru.wolfnord.lab11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student implements Comparable<Student>{
    private final String name;
    private final String secondName;
    private final int id;
    private final double GPA;

    private final String group;
    private final String course;
    private final String special;
    private final LocalDate birthDate;

    @Override
    public int compareTo(Student otherStudent) {
        return Double.compare(this.GPA, otherStudent.GPA);
    }

    public Student(String name, String secondName, int id, double GPA, String group, String course, String special, LocalDate birthDate) {
        this.name = name;
        this.secondName = secondName;
        this.id = id;
        this.GPA = GPA;
        this.group = group;
        this.course = course;
        this.special = special;
        this.birthDate = birthDate;
    }

    public double getGPA() {
        return GPA;
    }

    public String formatBirthDate(DateTimeFormatter formatter) {
        return birthDate.format(formatter);
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Студент: " + name + " " + secondName +
                ", ID студента: " + id + ", средний балл студента: " + GPA + ", группа: " + group +
                ", курс: " + course + ", специальность: " + special +
                ", Дата рождения: " + formatBirthDate(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}