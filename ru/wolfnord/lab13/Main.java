package ru.wolfnord.lab13;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Хотите создать файл без перезаписи?");
        System.out.println("false. Нет;");
        System.out.println("true. Да;");
        System.out.print(">> ");
        boolean choose = scanner.nextBoolean();
        System.out.println("Напиши текст, который хотите вставить в файл:");
        System.out.print(">> ");
        String text = scanner2.nextLine();
        try(FileWriter writer = new FileWriter("test.txt", choose))
        {
            writer.append(text);
            writer.flush();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        try(FileReader reader = new FileReader("test.txt")) {
            int c;
            while ((c=reader.read()) != -1) {
                System.out.print((char)c);
            }
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
