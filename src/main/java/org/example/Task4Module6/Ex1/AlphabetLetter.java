package org.example.Task4Module6.Ex1;

import java.util.Scanner;

public class AlphabetLetter {
    public static void main(String[] args) {
        int frequency = 0;
        char character = ' ';
        String linesOfText = " ";

        char[] alphabet = new char[26];
        for (char ch = 'a'; ch <= 'z'; ++ch)
        {
            alphabet[ch - 'a'] = ch;
        }
        System.out.println("Enter letter for counter: ");
        Scanner keyboard = new Scanner(System.in);
        linesOfText = keyboard.nextLine();
        System.out.print("Letter" + "Frequency");
        for (int i = 0; i < alphabet.length; i++)
        {   frequency = 0 ;
            for (int j = 0; j < linesOfText.length(); j++) {
                character = linesOfText.charAt(j) ;
                if (character == alphabet[i]) {
                    frequency++ ;
                }
            }

            System.out.println("\n" + alphabet[i] + "\t" + frequency); ;
        }
    }
}

