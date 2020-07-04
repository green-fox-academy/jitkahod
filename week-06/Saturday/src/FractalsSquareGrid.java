import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalsSquareGrid {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.black);
        drawToForth(graphics, 0, 0, WIDTH, HEIGHT, 20);
    }

    public static void drawToForth(Graphics g, int x, int y, int width, int height, int thickness) {
        if (width <= 5)
            return;
        for (int i = 0; i < thickness; i++) {
            g.drawRect(x - i + width / 4, y + height / 4 - i, (width / 4) * 2 + 2 * i, (height / 4) * 2 + 2 * i);
        }

        //recurse
        drawToForth(g, x + 1, y + 1, width / 2, height / 2, thickness / 2);
        drawToForth(g, x + width / 2, y + 1, width / 2, height / 2, thickness / 2);
        drawToForth(g, x, y + height / 2, width / 2, height / 2, thickness / 2);
        drawToForth(g, x + width / 2, y + height / 2, width / 2, height / 2, thickness / 2);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
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