package org.example;
import java.awt.*;
public class P2HW3 {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        int x = 40;
        int y = 50;
        myRect.width = x;
        myRect.height = y;
        System.out.println("myRect's area is " + (myRect.getWidth() * myRect.getHeight()));
    }
}
