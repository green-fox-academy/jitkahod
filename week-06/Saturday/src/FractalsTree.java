import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalsTree {


    public static void mainDraw(Graphics graphics) {

        drawTree(graphics, 300, 400, -90, 9);
    }

    private static void drawTree(Graphics g, int x, int y, double angle, int level) {
        if (level == 0) {
            return;
        }
        int xkonec = (int) (x + Math.cos(Math.toRadians(angle)) * 9 * level);
        int ykonec = (int) (y + Math.sin(Math.toRadians(angle)) * 9 * level);
        g.setColor(Color.yellow);
        g.drawLine(x, y, xkonec, ykonec);

        //recursion
        drawTree(g, xkonec, ykonec, angle - 25, level - 1);
        drawTree(g, xkonec, ykonec, angle + 25, level - 1);
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FractalsTree.ImagePanel panel = new FractalsTree.ImagePanel();
        panel.setBackground(Color.BLACK);
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