package org.example;

public class WordReverser implements TextManipulator {
    @Override
    public String reverseWords(String text) {
        StringBuilder result = new StringBuilder();
        String[] words = text.split("\\s+");

        for (String word : words) {
            result.append(reverseWord(word)).append(" ");
        }

        return result.toString().trim();
    }

    private String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();
        StringBuilder nonLetters = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                reversedWord.insert(0, c);
            } else {
                nonLetters.append(c);
            }
        }

        return reversedWord.append(nonLetters).toString();
    }
}

