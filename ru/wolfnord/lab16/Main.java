package ru.wolfnord.lab16;

import java.util.Scanner;

public class Main {
    static public void task1() { // Шаг 1 - Задание 1
        System.out.println( 2 / 0 );
    }

    static public void task2_1() { // Шаг 2.1
        System.out.println( 2.0 / 0.0 );
        try {
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    static public void task2_4() { // Шаг 2.2 - Задания 2-4
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) { // Task 3
            System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
        } catch (ArithmeticException e) { // Task 2
            System.out.println("Невозможно делить на ноль.");
        } finally { // Task 4
            System.out.println("Блок finally выполнен.");
        }
    }

    static public void main(String[] args) {
    //        task1(); // Вызывает ошибку
        task2_1();
        task2_4();
        Scanner scanner = new Scanner(System.in);
        // Задания 5-8
        System.out.println(getDetails(null));
        System.out.println(getDetails("123"));
        printDetails("");
    }

    public static String getMessage() {
        return "Поймано исключение";
    }

    public static void printDetails(String key) { // Task 7
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch (Exception e) {
            throw e;
        }
    }
    // Задание 5
    public static String getDetails(String key) {
        Scanner scanner = new Scanner(System.in);
        while (true) { // Task 8
            try {
                if (key == null) { // Task 5
                    throw new NullPointerException("null key in getDetails");
                }
            } catch (NullPointerException e) { // Проблема в том, что key равен null, а мы вызываем для этого исключение
                //                return getMessage(); // Task 6
                System.out.println(getMessage() + " " + 2);
                System.out.println("Введите ключ:"); // Task 8
                System.out.print(">> ");
                key = scanner.next();
            }
            return "Program Activation: " + key;

//            try {
//                if (key.isEmpty()) {
//                    throw new Exception("Key set to empty string"); // Task 7
//                }
//            } catch (Exception e) {
//                return getMessage() + " " + 2;
//            }
        }
    }
}
