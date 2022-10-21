package org.example.Task3;


public class VectorMain {
    public static void main(String[] args) {
        Vector[] array = Vector.anyMassive(4);
        Vector vector1 = new Vector(1, 2, 4);
        Vector vector2 = new Vector(2,3,4);
        System.out.println(vector1.vectorLength());
        System.out.println(vector2.calculateProduct(vector2));
        System.out.println(vector1.calculateProduct());
    }
}
