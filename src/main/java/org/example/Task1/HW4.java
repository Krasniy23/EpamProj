package org.example.Task1;

public class HW4 {
    public static void main(String[] args) {
        int [] arr = new int [] {5,6,7,12,-5,32,43};
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}

