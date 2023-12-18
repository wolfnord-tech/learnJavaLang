package ru.wolfnord.lab24;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private Map<String, Order> addressOrderMap;

    public OrderManager() {
        this.addressOrderMap = new HashMap<>();
    }

    public void addOrder(String address, Order order) {
        addressOrderMap.put(address, order);
    }

    public Order getOrder(String address) {
        return addressOrderMap.get(address);
    }

    public void removeOrder(String address) {
        addressOrderMap.remove(address);
    }

    public void addPositionToOrder(String address, Item item) {
        Order order = addressOrderMap.get(address);
        if (order != null) {
            order.addPosition(item);
        }
    }

    public Order[] getOrders() {
        return addressOrderMap.values().toArray(new Order[0]);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Order order : addressOrderMap.values()) {
            totalCost += order.getTotalCost();
        }
        return totalCost;
    }

    public int getTotalOrderedItemCount(String itemName) {
        int totalCount = 0;
        for (Order order : addressOrderMap.values()) {
            totalCount += order.getItemCount(itemName);
        }
        return totalCount;
    }
}
