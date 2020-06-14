import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingProjectLinePlay {

    public static void mainDraw(Graphics g) {


        g.setColor(new Color(180, 50, 255));
        for (int i = 30; i < HEIGHT; i += 25) {
            g.drawLine(10 + i, 10, WIDTH, 10 + i);
        }


        g.setColor(new Color(50, 180, 14));
        for (int i = 30; i < HEIGHT; i += 25) {
            g.drawLine( 10, 10+i , 10+i, HEIGHT);
        }

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

