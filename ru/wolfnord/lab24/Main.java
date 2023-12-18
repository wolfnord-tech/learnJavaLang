package ru.wolfnord.lab24;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

        while (true) {
            System.out.println("1. Вывести меню");
            System.out.println("2. Вывести список свободных столов");
            System.out.println("3. Создать заказ для адреса");
            System.out.println("4. Создать заказ для стола");
            System.out.println("5. Пометить стол как занятый");
            System.out.println("6. Добавить блюдо в меню");
            System.out.println("7. Выход");
            System.out.print("Введите ваш выбор: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // очищаем буфер

            switch (choice) {
                case 1:
                    restaurant.printMenu();
                    break;
                case 2:
                    restaurant.printFreeTables();
                    break;
                case 3:
                    System.out.print("Введите адрес для нового заказа: ");
                    String address = scanner.nextLine();

                    // Вывод пронумерованного меню и создание заказа
                    restaurant.printNumberedMenu();
                    System.out.print("Введите номера позиций для заказа (разделяйте пробелом): ");
                    String input = scanner.nextLine();
                    String[] selectedItems = input.split(" ");
                    Order newOrder = new Order() {
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
                    for (String itemNumber : selectedItems) {
                        int itemIndex = Integer.parseInt(itemNumber) - 1; // корректировка индекса (от 1 до 0-based)
                        if (itemIndex >= 0 && itemIndex < restaurant.getMenu().size())
                            newOrder.addPosition((Item) restaurant.getMenu().get(itemIndex));
                    }

                    restaurant.createOrderAddress(newOrder, address);
                    System.out.println("Новый заказ создан для адресса: " + address);
                    break;
                case 4:
                    System.out.print("Введите номер стола для нового заказа: ");
                    int tableNumber = scanner.nextInt();
                    scanner.nextLine();  // Очищаем буфер
                    restaurant.printNumberedMenu();
                    System.out.print("Введите номера позиций для заказа (разделяйте пробелом): ");
                    input = scanner.nextLine();
                    selectedItems = input.split(" ");
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
                    for (String itemNumber : selectedItems) {
                        int itemIndex = Integer.parseInt(itemNumber) - 1; // корректировка индекса (от 1 до 0-based)
                        if (itemIndex >= 0 && itemIndex < restaurant.getMenu().size()) {
                            newOrder.addPosition(restaurant.getMenu().get(itemIndex));
                        }
                    }
                    restaurant.createOrderForTable(newOrder, tableNumber);
                    System.out.println("Новый заказ создан для стола " + tableNumber);
                    break;
                case 5:
                    System.out.print("Введите номер занятого стола: ");
                    int occupiedTableNumber = scanner.nextInt();
                    restaurant.markTableAsOccupied(occupiedTableNumber);
                    System.out.println("Стол " + occupiedTableNumber + " помечен как занятый.");
                    break;
                case 6:
                    System.out.print("Введите название новой позиции: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Введите цену новой позиции: ");
                    double itemPrice = scanner.nextDouble();
                    restaurant.addMenuItem(itemName, itemPrice);
                    System.out.println("Новая позиция добавлена в меню.");
                    break;
                case 7:
                    System.out.println("Завершение работы программы...");
                    return;
                default:
                    System.out.println("Неверный выбор, пожалуйста, попробуйте снова.");
            }
        }
    }
}

