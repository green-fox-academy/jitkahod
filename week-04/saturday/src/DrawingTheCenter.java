import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingTheCenter {
    public static void mainDraw(Graphics g) {
         //drawToCenter(10, 10, g);

        for (int i = 0; i < 33; i++) {
            drawToCenter(i * 10, 10, g);
        }
    }

    // Create a function that draws a single line and takes 3 parameters:
// The x and y coordinates of the line's starting point and the graphics
// and draws a line from that point to the center of the canvas.
// Draw at least 3 lines with that function using a loop.
    public static void drawToCenter(int x, int y, Graphics g) {
        g.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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