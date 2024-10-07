package fr.hb;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(countWords("As you walk on the way, the way appears"));
        System.out.println(reverser("olleh"));
    }

    public static int countWords(String s) {

        int wordCount = 0;

        boolean word = false;
        int endOfLine = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
                word = true;

            } else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;

            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }

    public static String reverser(String string) {

        char[] resultarray = string.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = resultarray.length - 1; i >= 0; i--) {
            reversed.append(resultarray[i]);
        }

        if(string.equals(String.valueOf(reversed))){
            System.out.println(string + " est un palindrome");
        }else{
            System.out.println(string + " n'est pas un palindrome");
        }
        return reversed.toString();
    }



}