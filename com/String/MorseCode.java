package com.String;

import java.util.HashSet;

public class MorseCode {
    public static void main(String[] args) {
        String[] words = { "gin", "zen", "gig", "msg" };
        System.out.println(uniqueMorseRepresentations(words)); // 2
    }

    public static int uniqueMorseRepresentations(String[] words) {
        if (words.length == 1) {
            return 1;
        }

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.." };

        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < words.length; i++) {

            String code = "";
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                int x = (int) c;
                code = code + morse[x - 97];
            }
            hs.add(code);
        }

        return hs.size();
    }
}
