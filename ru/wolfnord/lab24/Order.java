package ru.wolfnord.lab24;

public interface Order {
    boolean addPosition(Item item);
    boolean removePosition(String name);
    int removeAllPositions(String name);
    int getTotalCount();
    Item[] getOrder();
    double getTotalCost();
    int getItemCount(String name);
    String[] getItemNames();
    Item[] getSortedItemsByCost();

    String getAddress();
    int getOrderNumber();
    void setCompleted(boolean completed);

    Item[] getItems();

    String getTableNumber();
}
