package org.example.Task3;

import java.util.Random;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double vectorLength(){
        return 0;
    }
    public double calculateProduct(){
        return 0;
    }
    public static Vector[] anyMassiv(int n){
        Vector[] array = new Vector[n];
        Random r = new Random();
        for(int i = 0; i<n; i++){
            array[i] = new Vector(r.nextDouble(), r.nextDouble(), r.nextDouble());
        }
        return array;
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
