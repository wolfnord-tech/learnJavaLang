package ru.wolfnord.lab6.task1;

public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Plate("Керамика", 500, true);
        Dish dish2 = new Cup("Стекло", 250, true);

        dish1.use();
        dish2.use();

        System.out.println("Материал тарелки: " + dish1.getMaterial());
        System.out.println("Вместимость тарелки: " + dish1.getCapacity());
        System.out.println("Тарелка разделена: " + ((Plate) dish1).isDivided());

        System.out.println("Материал кружки: " + dish2.getMaterial());
        System.out.println("Вместимость кружки: " + dish2.getCapacity());
        System.out.println("У кружки есть ручка: " + ((Cup) dish2).hasHandle());
    }
}

