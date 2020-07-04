import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalsSierpinskyCarpet {

    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.black);
        drawToCenter(graphics, 0, 0, WIDTH, HEIGHT);
    }

    public static void drawToCenter(Graphics g, int x, int y, int width, int height) {
        if (width <= 1)
            return;
        g.fillRect(x + width / 3, y + height / 3, width / 3, height / 3);

        drawToCenter(g,x, y, width / 3, height / 3);
          drawToCenter(g,x+width/3, y, width / 3, height / 3);
        drawToCenter(g,x+2*width/3, y, width / 3, height / 3);
         drawToCenter(g,x, y+height/3, width / 3, height / 3);
         // g.drawLine(x + width, y + height, width, height);
         drawToCenter(g,x+2*width/3, y+height/3, width / 3, height / 3);
         drawToCenter(g,x, y+2*height/3, width / 3, height / 3);
         drawToCenter(g,x +width/3, y+2*height/3, width / 3, height / 3);
        drawToCenter(g,x+2*width/3, y+2*height/3, width / 3, height / 3);
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

        



    

