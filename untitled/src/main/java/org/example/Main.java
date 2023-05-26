package org.example;

public class Main {
    public static void main(String[] args) {

        String inputText = "Each word in the1111 text should be reversed";

        TextManipulator textManipulator = new WordReverser();
        AnagramReverser anagramReverser = new AnagramReverser(textManipulator);

        String reversedText = anagramReverser.reverseWords(inputText);
        System.out.println(reversedText);
    }
}