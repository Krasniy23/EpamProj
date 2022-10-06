package org.example;

public class P2HW1 {
    public static void main(String[] args) {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";
        System.out.println(("The concatenated string with replacements:" + str1 + str2).replace("P", "").replace("p",""));
    }
}
