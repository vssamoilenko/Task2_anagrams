package com.foxminded.anagram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {

    public String reverseOnlyLetters(String text) {
        String outputText;
        if (text == null) text = "";
        List<String> words = Arrays.stream(text.split(" ")).collect(Collectors.toList());
        outputText = words.stream()
                .map(this::convertingTheWord)
                .collect (Collectors.joining(" "));
        return outputText;
    }

    private String convertingTheWord(String inputWord) {

        char[] inputWordBuild = inputWord.toCharArray();
        int indexStraight = 0;
        int indexBack = inputWord.length() - 1;
        boolean isStraightPositionCharLetter;
        boolean isBackPositionCharLetter;


        while (indexStraight <= indexBack) {
            isStraightPositionCharLetter = Character.isLetter(inputWordBuild[indexStraight]);
            isBackPositionCharLetter = Character.isLetter(inputWordBuild[indexBack]);
            if (isStraightPositionCharLetter) {
                if (isBackPositionCharLetter) {
                    swap( inputWordBuild, indexStraight, indexBack);
                    indexStraight++;
                }
                indexBack--;
            } else {
                indexStraight++;
                if (!isBackPositionCharLetter) {
                    indexBack--;
                }
            }
        }

        return String.valueOf(inputWordBuild);
    }

    private void swap(char[] inputWordBuild, int indexStraight, int indexBack) {

        char temp;
        temp = inputWordBuild[indexStraight];
        inputWordBuild[indexStraight] = inputWordBuild[indexBack];
        inputWordBuild[indexBack] = temp;

    }
}//public class Reverse end

