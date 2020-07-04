import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalsKochline {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.black);
        drawKochLine(graphics, 0, 0, WIDTH, HEIGHT);

    }

    public static void drawKochLine(Graphics g, int x, int y, int width, int heigh) {
        if (width <= 5)
            return;
        g.drawLine(x + width / 8, y + heigh - heigh / 8, width - (width / 8), y + heigh - heigh / 8);

       // drawKochLine();
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FractalsKochline.ImagePanel panel = new FractalsKochline.ImagePanel();
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


