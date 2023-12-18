package ru.wolfnord.lab17.task1;

import java.util.Scanner;

public class OnlinePurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ФИО:");
        String fullName = scanner.nextLine();

        System.out.println("Введите номер ИНН:");
        String inn = scanner.nextLine();

        try {
            validateInn(inn);
            System.out.println("Заказ оформлен успешно!");
        } catch (InvalidInnException e) {
            System.out.println("Ошибка: Недействительный ИНН!");
        }
    }

    public static void validateInn(String inn) throws InvalidInnException {
        if (inn.length() != 10)
            throw new InvalidInnException("Ошибка: Недействительный ИНН!");

        try {
            Long.parseLong(inn);
        } catch (NumberFormatException e) {
            throw new InvalidInnException("Ошибка: Недействительный ИНН!");
        }
    }
}

class InvalidInnException extends Exception {
    public InvalidInnException(String message) {
        super(message);
    }
}

