//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import javax.swing.JFrame;

public class Main extends JFrame {
    static final int w = 1920;
    static final int h = 1024;

    public Main() {
    }

    public static void draw(Graphics2D g) {
        BufferedImage img = new BufferedImage(1920, 1024, 2);
        int x1 = 777;
        int x2 = 333;
        int y1 = 666;
        int y2 = 222;
        Render.renderLine(img, x1, y1, x2, y2, Color.BLACK.getRGB());
        g.drawImage(img, 0, 0, (ImageObserver)null);
    }

    public static void main(String[] args) throws InterruptedException {
        Main jf = new Main();
        jf.setSize(1920, 1024);
        jf.setUndecorated(false);
        jf.setTitle("Моя супер программа");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(3);
        jf.createBufferStrategy(2);

        while(true) {
            long frameLength;
            long len;
            do {
                frameLength = 16L;
                long start = System.currentTimeMillis();
                BufferStrategy bs = jf.getBufferStrategy();
                Graphics2D g = (Graphics2D)bs.getDrawGraphics();
                g.clearRect(0, 0, jf.getWidth(), jf.getHeight());
                draw(g);
                bs.show();
                g.dispose();
                long end = System.currentTimeMillis();
                len = end - start;
            } while(len >= frameLength);

            Thread.sleep(frameLength - len);
        }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
}
