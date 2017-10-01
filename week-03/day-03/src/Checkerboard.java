import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics){
        // fill the canvas with a checkerboard pattern.

        for (int i = 0,  j = 30; i < 300; i += 60, j += 30) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(i, 0, 30, 30);
            graphics.setColor(Color.WHITE);
            graphics.fillRect(i + 30, 0, 30, 30);
            graphics.setColor(Color.WHITE);
            graphics.fillRect(i, 31, 30, 30);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(i + 30, 31, 30, 30);

            graphics.setColor(Color.BLACK);
            graphics.fillRect(i, 0, 30, 30);
            graphics.setColor(Color.WHITE);
            graphics.fillRect(i + 30, 0, 30, 30);
            graphics.setColor(Color.WHITE);
            graphics.fillRect(i, 31, 30, 30);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(i + 30, 31, 30, 30);






//        for (int i = 0,  j = 0; i < 300; i += 60, j += 30) {
//            graphics.setColor(Color.BLACK);
//            graphics.fillRect(i, 0, 30, 30);
//            graphics.setColor(Color.WHITE);
//            graphics.fillRect(i + 30, 0, 30, 30);
//            graphics.setColor(Color.WHITE);
//            graphics.fillRect(i, 31, 30, 30);
//            graphics.setColor(Color.BLACK);
//            graphics.fillRect(i + 30, 31, 30, 30);
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