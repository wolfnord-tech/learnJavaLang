package ru.wolfnord.lab23;

import java.util.ArrayList;
import java.util.List;

public class TablesOrderManager {
    private List<Order> orders;

    public TablesOrderManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }
}
