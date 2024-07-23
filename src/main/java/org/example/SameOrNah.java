package org.example;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println("Enter another word: ");
        String otherWord = scanner.nextLine();

        if (word.toLowerCase().equals(otherWord.toLowerCase())) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}
