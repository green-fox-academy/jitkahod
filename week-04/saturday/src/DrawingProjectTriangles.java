import sun.java2d.loops.DrawLine;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingProjectTriangles {

    public static void mainDraw(Graphics g) {

        g.setColor(Color.black);
        for (int i = 0; i < WIDTH; i += 10) {
            int[] x = {10, 20, 0};
            int[] y = {0, 20, 20};
            g.drawPolygon(x, y, 3);



           // g.drawLine(i, WIDTH, WIDTH / 2 + (i / 2), i);
           // g.drawLine(WIDTH/2+(i/2), i, WIDTH / 2 - (i / 2), i);


           // g.drawLine(WIDTH-i, HEIGHT, WIDTH / 2 - (i / 2), i);

        }


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        DrawingProjectTriangles.ImagePanel panel = new DrawingProjectTriangles.ImagePanel();
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