package ru.wolfnord.lab17.task2;

import java.util.ArrayList;
import java.util.List;

public class LabClass {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentByFullName(String fullName) throws StudentNotFoundException, EmptyStringException {
        if (fullName.isEmpty()) {
            throw new EmptyStringException("Строка пустая");

        }
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с именем " + fullName + " не найден");
    }

    public List<Student> getStudents() {
        return students;
    }
}
