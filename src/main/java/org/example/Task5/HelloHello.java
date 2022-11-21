package org.example.Task5;

public class HelloHello {
    interface StringFunction {
        String run(String str);
    }
    public class Main {
        public static void main(String[] args) {
            StringFunction exclaim = (s) -> "Hello";
            StringFunction ask = (s) -> "Hello" ;
            printFormatted("Hello", exclaim);
            printFormatted("Hello", ask);
        }

        public static void printFormatted(String str, StringFunction format) {
            String result = format.run(str);
            System.out.print(result);
        }
    }
}
