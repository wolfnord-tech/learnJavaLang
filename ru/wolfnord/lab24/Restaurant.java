package ru.wolfnord.lab24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Restaurant {
    private ArrayList<MenuItem> menu;
    private ArrayList<Integer> freeTables;
    private HashMap<String, Order> addressOrders;
    private HashMap<Integer, Order> tableOrders;
    private HashMap<Integer, Boolean> tables;

    public Restaurant() {
        this.menu = new ArrayList<>();
        this.freeTables = new ArrayList<>();
        this.addressOrders = new HashMap<>();
        this.tableOrders = new HashMap<>();
        this.tables = new HashMap<>();
        this.orders = new ArrayList<>();
        menu.add(new MenuItem("Паста карбонара", 12.99));
        menu.add(new MenuItem("Стейк с гарниром", 18.50));
        menu.add(new MenuItem("Цезарь с куриной грудкой", 9.99));
        menu.add(new MenuItem("Пицца Маргарита", 10.99));
        menu.add(new MenuItem("Суп гороховый", 6.99));
        menu.add(new MenuItem("Салат Греческий", 8.99));
        menu.add(new MenuItem("Бургер с картошкой фри", 11.99));
        menu.add(new MenuItem("Фруктый десерт", 5.99));
        menu.add(new MenuItem("Рыбный тартар",15.99));
        menu.add(new MenuItem("Шашлык из курицы", 13.50));
        menu.add(new MenuItem("Кока-кола", 2.50));
        menu.add(new MenuItem("Шампанское", 25.00));
        menu.add(new MenuItem("Мохито", 8.00));
        menu.add(new MenuItem("Красное вино", 20.00));
        menu.add(new MenuItem("Молочный коктейль", 7.50));

        for (int i = 1; i <= 10; i++) {
            tables.put(i, true); // Предположим, что все столы в начале свободны
        }
    }

    public void addMenuItem(String name, double price) {
        if (price < 0) {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Цена не может быть отрицательной. Пожалуйста, введите положительную цену: ");
                price = scanner.nextDouble();
            } while (price < 0);
        }
        menu.add(new MenuItem(name, price));
    }
    public void printMenu() {
        System.out.println("Меню ресторана:");
        for (MenuItem item : menu) {
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }

    public void printNumberedMenu() {
        System.out.println("Меню ресторана:");
        int index = 1;
        for (MenuItem item : menu) {
            System.out.println(index + ". " + item.getName() + " " + item.getPrice());
            index++;
        }
    }


    public void printFreeTables() {
        System.out.println("Свободные столы:");
        for (Map.Entry<Integer, Boolean> entry : tables.entrySet()) {
            if (entry.getValue()) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }
    public void createOrderAddress(Order newOrder, String address) {
        addressOrders.put(address, newOrder);
    }

    private int orderCounter = 1; // поле для хранения счетчика заказов

    public void createOrderForTable(Order newOrder, int tableNumber) {
        if (tables.containsKey(tableNumber) && tables.get(tableNumber)) {
            tables.put(tableNumber, false); // Помечаем стол как занятый
            newOrder = new Order() {
                @Override
                public boolean addPosition(Item item) {
                    return false;
                }

                @Override
                public boolean removePosition(String name) {
                    return false;
                }

                @Override
                public int removeAllPositions(String name) {
                    return 0;
                }

                @Override
                public int getTotalCount() {
                    return 0;
                }

                @Override
                public Item[] getOrder() {
                    return new Item[0];
                }

                @Override
                public double getTotalCost() {
                    return 0;
                }

                @Override
                public int getItemCount(String name) {
                    return 0;
                }

                @Override
                public String[] getItemNames() {
                    return new String[0];
                }

                @Override
                public Item[] getSortedItemsByCost() {
                    return new Item[0];
                }

                @Override
                public String getAddress() {
                    return null;
                }

                @Override
                public int getOrderNumber() {
                    return 0;
                }

                @Override
                public void setCompleted(boolean completed) {

                }

                @Override
                public Item[] getItems() {
                    return new Item[0];
                }

                @Override
                public String getTableNumber() {
                    return null;
                }
            };
            orders.add(newOrder); // Добавляем созданный заказ в список заказов
            System.out.println("Новый заказ создан для стола " + tableNumber + " с номером " + newOrder.getOrderNumber());
        } else {
            System.out.println("Извините, выбранный стол занят. Пожалуйста, выберите другой стол.");
        }
    }


    public void markTableAsOccupied(int tableNumber) {
        if (tables.containsKey(tableNumber)) {
            if (tables.get(tableNumber)) {
                tables.put(tableNumber, false); // Помечаем стол как занятый
                System.out.println("Стол " + tableNumber + " помечен как занятый.");
            } else {
                System.out.println("Стол " + tableNumber + " уже занят.");
            }
        } else {
            System.out.println("Стол " + tableNumber + " не существует.");
        }
    }
    public ArrayList<MenuItem> getMenu() {
        return menu;
    }
    private ArrayList<Order> orders;
    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("Нет текущих заказов.");
        } else {
            System.out.println("Список всех заказов:");
            for (Order order : orders) {
                System.out.println("Заказ номер " + order.getOrderNumber() + " для стола " + order.getTableNumber());
                System.out.println("Позиции в заказе:");
                for (Item item : order.getItems()) {
                    System.out.println(item.getName() + ": " + item.getPrice());
                }
                System.out.println("Общая стоимость: " + order.getTotalCost());
                // Другая информация о заказе, если необходимо
            }
        }
    }


    public void markOrderAsCompleted(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == orderNumber) {
                orders.remove(i); // Удаляем завершенный заказ из списка заказов
                System.out.println("Заказ " + orderNumber + " помечен как выполненный.");
                return;
            }
        }
        System.out.println("Заказ с номером " + orderNumber + " не найден.");
    }
}
