package org.example.Task3.Shape;

public abstract class Round implements Shape {

    public int sideA;
    public int sideB;

    public void Round(int a, int b) {
        this.sideA = a;
        this.sideB = b;
    }

    @Override
    public double area() {
        return Math.PI * sideA * sideB;
    }
}

