package ru.wolfnord.lab8;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    abstract void draw(Graphics2D g2);
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fill(new Ellipse2D.Double(x, y, radius * 2, radius * 2));
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fill(new Rectangle2D.Double(x, y, width, height));
    }
}

class DrawingPanel extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private static final int SHAPE_COUNT = 20;
    private static final int MAX_SIZE = 100;

    private Random random;
    private Shape[] shapes;

    public DrawingPanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        random = new Random();
        shapes = new Shape[SHAPE_COUNT];

        for (int i = 0; i < SHAPE_COUNT; i++) {
            int x = random.nextInt(WIDTH - MAX_SIZE);
            int y = random.nextInt(HEIGHT - MAX_SIZE);
            int size = random.nextInt(MAX_SIZE);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (i % 2 == 0) {
                shapes[i] = new Circle(color, x, y, size);
            } else {
                shapes[i] = new Rectangle(color, x, y, size, size);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for (Shape shape : shapes) {
            shape.draw(g2);
        }
    }
}

public class Figure {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawingPanel panel = new DrawingPanel();
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}