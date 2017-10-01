import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics){
        // reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/envelope-star/r2.png]

        for(int i = 10, j = 140, k = 160, l =300; i <= 150; i += 10, j -= 10, k += 10, l -= 10) {
            graphics.setColor(Color.RED);
            graphics.drawLine(150, i, j, 150);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(i, 150, 150,k);
            graphics.setColor(Color.CYAN);
            graphics.drawLine(150, i, k, 150);
            graphics.setColor(Color.ORANGE);
            graphics.drawLine(l, 150, 150, k);
        }


    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}