package ru.wolfnord.lab6.task3;

public class Main {
    public static void main(String[] args) {
        Furniture chair = new Chair("Дерево", 100, 4);
        Furniture table = new Table("Стекло", 200, 6);
        Furniture cabinet = new Cabinet("Металл", 300, 3);

        chair.use();
        table.use();
        cabinet.use();

        System.out.println("Тип мебели: " + chair.getType());
        System.out.println("Материал мебели: " + chair.getMaterial());
        System.out.println("Цена мебели: " + chair.getPrice());
        System.out.println("Количество ножек у стула: " + ((Chair) chair).getLegs());

        System.out.println("Тип мебели: " + table.getType());
        System.out.println("Материал мебели: " + table.getMaterial());
        System.out.println("Цена мебели: " + table.getPrice());
        System.out.println("Количество мест у стола: " + ((Table) table).getSeats());

        System.out.println("Тип мебели: " + cabinet.getType());
        System.out.println("Материал мебели: " + cabinet.getMaterial());
        System.out.println("Цена мебели: " + cabinet.getPrice());
        System.out.println("Количество полок у шкафа: " + ((Cabinet) cabinet).getShelves());

        FurnitureShop shop = new FurnitureShop("Мебельный магазин");
        shop.sellFurniture(chair);
        shop.sellFurniture(table);
        shop.sellFurniture(cabinet);
    }
}

