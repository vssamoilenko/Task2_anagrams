package com.foxminded.anagram;

import java.util.Scanner;

public class InputText {

    public static void main(String[] args) {

        StringBuilder inputText = new StringBuilder();
        String inputWord = "";

        while (!inputWord.equals("q")) {

            System.out.println("Input the word and press Enter or input 'q' and press Enter for exit");
            Scanner myObj = new Scanner(System.in);
            inputWord = myObj.nextLine();
            if (inputWord.equals("q")) {
                printInputText(inputText);
                printResult(inputText);
            } else {
                if (inputWord.equals("")) {
                    System.out.println("You don't input anything");
                } else {
                    if (!inputText.toString().equals("")) {
                        inputText.append(" ").append(inputWord);
                    } else {
                        inputText = new StringBuilder(inputWord);
                    }
                    printInputText(inputText);
                }
            }
        }
    }

    private static void printInputText(StringBuilder inputText) {
        System.out.println("your input text is: '" + inputText + "'");
    }

    private static void printResult(StringBuilder inputText) {
        Reverse reverseInputText = new Reverse();
        System.out.println("          Result is:'" + reverseInputText.reverseOnlyLetters(inputText.toString()) + "'");
    }
}
