import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingProjectQuarter {

    public static void mainDraw(Graphics g) {


        for (int i = 0; i < WIDTH / 2; i += 15) {
            g.setColor(new Color(180, 50, 255));
            drawPurple(i, g);
            g.setColor(new Color(50, 180, 14));
            drawGreen(i, g);
        }
    }

    public static void drawPurple(int p, Graphics g) {  //p=progress
        g.drawLine(p, 0, WIDTH / 2, p);
        g.drawLine(WIDTH / 2 + p, 0, WIDTH, p);
        g.drawLine(p, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + p);
        g.drawLine(WIDTH / 2 + p, HEIGHT / 2, WIDTH, HEIGHT / 2 + p);
    }

    public static void drawGreen(int p, Graphics g) {     //p=progress
        g.drawLine(0, p, p, HEIGHT / 2);
        g.drawLine(WIDTH / 2, p, WIDTH / 2 + p, HEIGHT / 2);
        g.drawLine(0, HEIGHT / 2 + p, p, HEIGHT);
        g.drawLine(WIDTH / 2, HEIGHT / 2 + p, WIDTH / 2 + p, HEIGHT);
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
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