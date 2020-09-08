package com.company;


import java.awt.*;
import java.awt.image.BufferedImage;

public class Render {


    //Стоит начать с этого
    public static void renderLine(BufferedImage img, int x1, int y1, int x2, int y2, int color) {
        if (x1 > x2) {
            if (y1 > y2) {
                if ((x1 - x2) > (y1 - y2)) {
                    for (int i = x2; i < x1; i++) {
                        int y = ((x1 - i) * (y1 - y2) / (x1 - x2) + y1);
                        img.setRGB(i, y, Color.BLACK.getRGB());
                    }
                } else {
                    for (int i = y2; i < y1; i++) {
                        int x = ((y1 - i) * (x1 - x2)) / (y1 - y2) + x1;
                        img.setRGB(x, i, Color.BLACK.getRGB());
                    }

                }
            } else {
                if ((x1 - x2) > (y2 - y1)) {
                    for (int i = x2; i < x1; i++) {
                        int y = ((x1 - i) * (y1 - y2) / (x1 - x2) + y1);
                        img.setRGB(i, y, Color.BLACK.getRGB());
                    }
                } else {
                    for (int i = y1; i < y2; i++) {
                        int x = ((y1 - i) * (x2 - x1)) / (y1 - y2) + x1;
                        img.setRGB(x, i, Color.BLACK.getRGB());
                    }
                }
            }
        } else if (y2 > y1) {
            if ((x2 - x1) > (y2 - y1)) {
                for (int i = x1; i < x2; i++) {
                    int y = (i - x1) * (y2 - y1) / (x1 - x2) + y1;
                    img.setRGB(i, y, Color.BLACK.getRGB());
                }
            } else {
                for (int i = y1; i < y2; i++) {
                    int x = ((y1 - i) * (x2 - x1)) / (y1 - y2) + x1;
                    img.setRGB(x, i, Color.BLACK.getRGB());
                }
            }
        } else if ((x2 - x1) > (y1 - y2)) {
            for (int i = x1; i < x2; i++) {
                int y = ((x1 - i) * (y1 - y2) / (x1 - x2) + y1);
                img.setRGB(i, y, Color.BLACK.getRGB());
            }
        } else {
            for (int i = y2; i < y1; i++) {
                int x = ((y1 - i) * (x1 - x2)) / (y1 - y2) + x1;
                img.setRGB(x, i, Color.BLACK.getRGB());

            }
        }
    }
}



