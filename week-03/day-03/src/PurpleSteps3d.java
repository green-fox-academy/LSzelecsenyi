import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {

    public static void mainDraw(Graphics graphics){
        // reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

        int xCoo = 0;
        int yCoo = 0;
        int xCooBorder = 1;
        int yCooBorder = 1;

        for (int i = 0; i < 6; i++) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(xCoo += 10*i, yCoo += 10*i, 10 + (i * 10), 10 + (i * 10));
            graphics.setColor(Color.MAGENTA);
            graphics.fillRect(xCooBorder += 10*i, yCooBorder += 10*i, 8 + (i * 10), 8 + (i*10));
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