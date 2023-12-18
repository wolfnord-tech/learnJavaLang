package ru.wolfnord.lab2;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Вывести на экран сумму чисел массива с помощью циклов for, while, do while.
        // Цикл for
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println("Сумма чисел массива (for): " + sum);

        // Цикл while
        sum = 0;
        int j = 0;
        while (j < array.length) {
            sum += array[j];
            j++;
        }
        System.out.println("Сумма чисел массива (while): " + sum);

        // Цикл do-while
        sum = 0;
        int k = 0;
        do {
            sum += array[k];
            k++;
        } while (k < array.length);
        System.out.println("Сумма чисел массива (do-while): " + sum);
        // Вывести на экран аргументы командной строки в цикле for.
        System.out.print("Вывод аргументов командной строки: ");
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println();
        // Вывести на экран первые 10 чисел гармонического ряда.
        System.out.println("Вывод на экран 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(1.0 / i);
        }
        // Сгенерировать массив целых чисел случайным образом, вывести его на экран, отсортировать его и снова вывести на экран.
        int[] array2 = new int[10];
        Random random = new Random();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(100);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Отсортированный массив: " + Arrays.toString(array2));
        // Создать метод, вычисляющий факториал числа с помощью цикла, проверить работу метода.
        int number = 5; // Пример числа для вычисления факториала
        int factorialResult = factorial(number);
        System.out.println("Факториал числа " + number + " = " + factorialResult);
    }
}
