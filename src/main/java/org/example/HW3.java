package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        String input1 = sc.nextLine();
        double d1 = Double.parseDouble(input1);

        System.out.print("Input second number: ");
        String input2 = sc.nextLine();
        double d2 = Double.parseDouble(input2);

        double result = d1 + d2;
        double result1 = d1 - d2;
        double result2 = d1 * d2;
        double result3 = d1 / d2;


        System.out.println("Answer by sum " + result);
        System.out.println("Answer by subtract " + result1);
        System.out.println("Answer by multiply " + result2);
        System.out.println("Answer by divide  " + result3);

    }
}
