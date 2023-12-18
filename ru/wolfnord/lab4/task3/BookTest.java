package ru.wolfnord.lab4.task3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Александр Пушкин", "Евгений Онегин", 1823);
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год написания: " + book.getYear());
    }
}