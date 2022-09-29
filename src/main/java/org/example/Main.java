package org.example;

public class Main {
    private static String[] months =
            {"January","february","March", "April","January1","february1","March1", "April1"};
    public static void main(String[] args) {

        loopMonths();
    }

    private static void loopMonths() {
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }
}
