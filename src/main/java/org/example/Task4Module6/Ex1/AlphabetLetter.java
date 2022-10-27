package org.example.Task4Module6.Ex1;

import java.util.Scanner;

public class AlphabetLetter {
    public static void main(String[] args) {
        int frequency;
        char character;
        String linesOfText;

        char[] alphabet = new char[26];
        for (char ch = 'a'; ch <= 'z'; ++ch)
        {
            alphabet[ch - 'a'] = ch;
        }
        System.out.println("Enter letter for counter: ");
        Scanner keyboard = new Scanner(System.in);
        linesOfText = keyboard.nextLine();
        System.out.print("Letter" + "Frequency");
        for (char c : alphabet) {
            frequency = 0;
            for (int j = 0; j < linesOfText.length(); j++) {
                character = linesOfText.charAt(j);
                if (character == c) {
                    frequency++;
                }
            }

            System.out.println("\n" + c + "\t" + frequency);
        }
    }
}
