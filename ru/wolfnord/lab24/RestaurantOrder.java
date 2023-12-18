package ru.wolfnord.lab24;
import java.util.*;

public abstract class RestaurantOrder implements Order {
    private ArrayList<Item> items;

    public RestaurantOrder() {
        this.items = new ArrayList<>();
    }

    @Override
    public boolean addPosition(Item item) {
        return items.add(item);
    }

    @Override
    public boolean removePosition(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAllPositions(String name) {
        int count = 0;
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(name)) {
                iterator.remove();
                count++;
            }
        }
        return count;
    }

    @Override
    public int getTotalCount() {
        return items.size();
    }

    @Override
    public Item[] getOrder() {
        return items.toArray(new Item[0]);
    }

    @Override
    public double getTotalCost() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    @Override
    public int getItemCount(String name) {
        int count = 0;
        for (Item item : items) {
            if (item.getName().equals(name)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String[] getItemNames() {
        Set<String> itemNamesSet = new HashSet<>();
        for (Item item : items) {
            itemNamesSet.add(item.getName());
        }
        return itemNamesSet.toArray(new String[0]);
    }

    @Override
    public Item[] getSortedItemsByCost() {
        Item[] sortedItems = items.toArray(new Item[0]);
        Arrays.sort(sortedItems, Comparator.comparingDouble(Item::getCost).reversed());
        return sortedItems;
    }
}
