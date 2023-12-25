package com.String;

public class DetectCapital {
    public static void main(String[] args) {
        String word = "Google";
        System.out.println(detectCapitalUse(word)); // true
    }

    public static boolean detectCapitalUse(String word) {
        int uppercase_count = 0;

        for(int i=0; i<word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                uppercase_count++;
            }
        }

        // all are uppercase
        if(uppercase_count == word.length()) return true;

        // all are lowercase
        if(uppercase_count == 0) return true;

        // if uppercase_count is 1, then if first letter is uppercase -> return true
        // else other letter is uppercase -> so return false.
        if(uppercase_count == 1) return Character.isUpperCase(word.charAt(0));

        return false;
    }
}
