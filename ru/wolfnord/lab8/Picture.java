package ru.wolfnord.lab8;

import javax.swing.*;
import java.util.Scanner;
import java.awt.Image;

public class Picture {
    public static void main(String[] args) {
        String path;
        Image img;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к картинке"); // "C:\Users\alexeycode\IdeaProjects\learnJavaLang_jetbrains\src\ru\wolfnord\lab8\img.jpg"
        path = scanner.next();
        img = new ImageIcon(path).getImage();
        JFrame frame = new JFrame(path);
        frame.getContentPane().add(new JLabel(new ImageIcon(img)));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
