package ru.wolfnord.lab15.task2;

public class MVCEmployeeTest {
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController();
        controller.setModel(model);
        controller.setView(view);
        controller.updateView();
        controller.getModel().setName("Andrew Kotov");
        controller.getModel().setSalary(50000);
        System.out.println("\nРезультат после обновления:\n");
        controller.updateView();
    }

    public static Employee retriveEmployeeFromDatabase() {
        Employee Employee = new Employee();
        Employee.setName("Kate Artist");
        Employee.setSalary(70000);
        return Employee;
    }
}
