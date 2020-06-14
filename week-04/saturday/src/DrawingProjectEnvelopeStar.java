import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingProjectEnvelopeStar {

    public static void mainDraw(Graphics g) {

        for (int i = 0; i < WIDTH / 2; i += 10) {
            g.setColor(new Color(50, 180, 14));
            g.drawLine(WIDTH / 2, i, WIDTH / 2 - i, HEIGHT / 2);
            g.drawLine(WIDTH / 2, i, WIDTH / 2 + i, HEIGHT / 2);
            g.drawLine(WIDTH / 2, HEIGHT - i, WIDTH / 2 - i, HEIGHT / 2);
            g.drawLine(WIDTH / 2, HEIGHT - i, WIDTH / 2 + i, HEIGHT / 2);

        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        DrawingProjectEnvelopeStar.ImagePanel panel = new DrawingProjectEnvelopeStar.ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setBackground(Color.white);
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

        