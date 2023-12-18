package ru.wolfnord.lab3.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Алексец", "email@example.com", 'M');

        System.out.println("Имя: " + author.getName());
        System.out.println("Пол: " + author.getGender());
        System.out.println("Почта: " + author.getEmail());

        author.setEmail("newemail@example.com");
        System.out.println("Измененная почта: " + author.getEmail() + "\n");

        System.out.println(author);
    }
}

