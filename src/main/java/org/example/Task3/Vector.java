package org.example.Task3;

import java.util.Random;


public class Vector {
    private final double x;
    private final double y;
    private final double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength() {
        return (Math.sqrt(x * x + y * y + z * z));
    }

    public double calculateProduct(Vector vector) {
        return (x * vector.x + y * vector.y + z * vector.z);
    }

    public double calculateProduct() {
        Vector vector = anyVector();
        return (x * vector.x + y * vector.y + z * vector.z);
    }

    public static Vector[] anyMassive(int n) {
        Vector[] array = new Vector[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = new Vector(r.nextDouble(), r.nextDouble(), r.nextDouble());
        }
        return array;
    }

    public static Vector anyVector() {
        Random r = new Random();
        return new Vector(r.nextDouble(), r.nextDouble(), r.nextDouble());
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

}
