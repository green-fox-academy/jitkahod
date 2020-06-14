import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingRainbowBox {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).


        Color[] colores = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, new Color(70, 0, 130), new Color(143, 80, 157)};

        for (int i = 0; i < colores.length; i++) {
            drawRainbowBox(WIDTH - i * 52, colores[i], graphics);
        }
        /*for (int i = 0; i < 300; i++) {
            Color c = new Color(Color.HSBtoRGB(i/300.0f, 1.0f, 0.5f));
            drawRainbowBox(WIDTH - i, c, graphics);
        }*/
    }

    public static void drawRainbowBox(int s, Color color, Graphics g) {
        g.setColor(color);
        g.fillRect((WIDTH / 2) - s / 2, (HEIGHT / 2) - s / 2, s, s);
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