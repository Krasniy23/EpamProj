package org.example;

public class HW5 {
    public static void main(String[] args) {
        int [] arr = new int [] {5,6,7,12,-5,32,43,6,12};

        System.out.println("Duplicate elements in given array: ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}

