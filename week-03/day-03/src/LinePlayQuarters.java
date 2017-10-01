import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics){
        // divide the canvas into 4 parts
        // and repeat this pattern in each quarter:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]
        
        for (int x = 150, y = 10, z = 150, p = 300, q = 150; y <= 150; x -= 10, y += 10, z += 10, p -= 10, q += 10) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(q,0, 300, y);
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(0, q, y, 300);
            graphics.setColor(Color.ORANGE);
            graphics.drawLine(x,0, 0, y);
            graphics.setColor(Color.CYAN);
            graphics.drawLine(z, 300, 300, p);
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