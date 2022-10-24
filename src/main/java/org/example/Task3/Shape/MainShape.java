package org.example.Task3.Shape;

public class MainShape {
    public static void main(String[] args) {

        Rectangle reg = new Rectangle(3,4);
        System.out.println("Rectangle = " + reg.area());

        Circle cir = new Circle(5);
        System.out.println("Circle = " + cir.area());

        Oval ova = new Oval(2,3);
        System.out.println("Oval = " + ova.area());

        Shape square = new Square(2);
        System.out.println("Square = " + square.area());

    }
}
