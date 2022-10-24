package org.example.Task3.Shape;

public abstract class Rectangular implements Shape {
    public int sideA;
    public int sideB;

    public void Rectangle(int a, int b) {
        this.sideA = a;
        this.sideB = b;
    }

    @Override
     public double area() {
        return sideA * sideB;
    }
}
