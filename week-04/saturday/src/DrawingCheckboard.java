import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingCheckboard {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]


        for (int i = 1; i < 16; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    graphics.setColor(Color.black);
                    graphics.fillRect(20 * j * 2, 20 * i, 20, 20);
                    graphics.setColor(Color.white);
                    graphics.drawRect((20 * j * 2) + 20, 20 * i, 20, 20);
                }
            } else  {
                for (int j = 0; j < 8; j++) {
                    graphics.setColor(Color.white);
                    graphics.drawRect(20 * j * 2, 20 * i, 20, 20);
                    graphics.setColor(Color.black);
                    graphics.fillRect((20 * j * 2) + 20, 20 * i, 20, 20);
                }
            }
        }
    }

    // Don't touch the code below                              ,
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setBackground(Color.WHITE);
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
