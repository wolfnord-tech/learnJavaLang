package ru.wolfnord.lab1.task3;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Белый клык", "Джек Лондон", 1906);

        System.out.println("Название книги: " + book.getTitle());
        System.out.println("Автор книги: " + book.getAuthor());
        System.out.println("Год издания: " + book.getYear());
    }
}
