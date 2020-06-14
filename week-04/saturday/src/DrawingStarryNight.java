import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingStarryNight {

    public static void mainDraw(Graphics g) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        //background
        Random r = new Random();
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        int x, y;
        //stars
        for (int i = 0; i < 100; i++) {
            g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));

            //extra barevne
            x = r.nextInt(WIDTH);
            y = r.nextInt(HEIGHT);
            g.fillRect(x, y, 3, 3);

            //grey stars
            x = r.nextInt(WIDTH);
            y = r.nextInt(HEIGHT);

            int s1 = r.nextInt(255);
            g.setColor(new Color(s1, s1, s1));

            //g.fillRect(x, y, 2, 2);
            g.fillOval(x, y, 3, 3);
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
