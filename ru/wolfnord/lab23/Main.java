package ru.wolfnord.lab23;

public class Main {
    public static void main(String[] args) {
        // Создание объектов
        Item drink = new Drink(2.99, "Coke", "Refreshing beverage");
        Item drink2 = new Drink(91.99, "Water", "Refreshing beverage");
        Item dish = new Dish(9.99, "Pasta", "Delicious pasta dish");
        Item dish2 = new Dish(19.99, "Pizza", "Delicious pizza dish");


        System.out.println("Объекты созданы!\n");

        System.out.println("Name: " + drink.getName());
        System.out.println("Description: " + drink.getDescription());
        System.out.println("Price: " + drink.getPrice() + "\n");

        System.out.println("Name: " + dish.getName());
        System.out.println("Description: " + dish.getDescription());
        System.out.println("Price: " + dish.getPrice() + "\n");

        // Создание заказа
        Order order = new Order();
        order.addItem(drink);
        order.addItem(dish);
        order.addItem(drink2);

        Order order2 = new Order();
        order2.addItem(drink);
        order2.addItem(dish);
        order2.addItem(dish2);
        order2.addItem(drink2);

        // Удаление элемента из заказа
        order.removeItem(drink);

        // Создание менеджера заказов
        TablesOrderManager orderManager = new TablesOrderManager();
        orderManager.addOrder(order);
        orderManager.addOrder(order2);
        orderManager.removeOrder(order);

        // Создание заказа через интернет
        Item[] items = {dish, drink2, dish2};
        InternetOrder internetOrder = new InternetOrder(items);

        // Добавление и удаление позиции из заказа через интернет
        internetOrder.addPosition(drink);
        internetOrder.removePositionByName("Coke");

        // Удаление всех позиций с определенным названием из заказа через интернет
        internetOrder.removeAllPositionsByName("Pasta");

        // Вывод результатов
        System.out.println("Элементы заказа:");
        for (Item item : order.getItems()) {
            System.out.println(item.getName());
        }
        System.out.println("\nЗаказы менеджера заказов:");
        for (Order order_i : orderManager.getOrders()) {
            System.out.println("Заказ:");
            for (Item item : order_i.getItems()) {
                System.out.println("  " + item.getName());
            }
        }
        System.out.println("\nПозиции заказа через интернет:");
        for (Item item : internetOrder.getPositions()) {
            System.out.println(item.getName());
        }
    }
}
