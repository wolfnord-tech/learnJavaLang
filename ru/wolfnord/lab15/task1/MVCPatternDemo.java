package ru.wolfnord.lab15.task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController();
        controller.setModel(model);
        controller.setView(view);
        controller.updateView();
        controller.getModel().setName("Andrew Kotov");
        controller.getModel().setRollNo("Designer");
        System.out.println("\nРезультат после обновления:\n");
        controller.updateView();
    }

    public static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Alexey");
        student.setRollNo("Developer");
        return student;
    }
}
