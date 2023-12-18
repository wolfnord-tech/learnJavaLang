package ru.wolfnord.lab8;

import javax.swing.*;

public class Animation extends JFrame {

    private JLabel animationLabel;
    private ImageIcon animationIcon;

    public Animation() {
        setTitle("Анимация");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        animationIcon = new ImageIcon("src/ru/wolfnord/lab8/an.gif");
        animationLabel = new JLabel(animationIcon);

        add(animationLabel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Animation::new);
    }
}
