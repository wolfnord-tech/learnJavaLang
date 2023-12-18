package ru.wolfnord.lab15.task2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController() {

    }
    public Employee getModel() {
        return model;
    }

    public EmployeeView getView() {
        return view;
    }

    public void setModel(Employee model) {
        this.model = model;
    }

    public void setView(EmployeeView view) {
        this.view = view;
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), getModel().getSalary());
    }
}
