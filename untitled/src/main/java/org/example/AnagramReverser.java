package org.example;

public class AnagramReverser {
    private final TextManipulator textManipulator;

    public AnagramReverser(TextManipulator textManipulator) {
        this.textManipulator = textManipulator;
    }

    public String reverseWords(String text) {
        return textManipulator.reverseWords(text);
    }
}

