package com.String;

import java.util.ArrayList;
import java.util.HashSet;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        findWords(words); // ["Alaska","Dad"]
    }

    public static String[] findWords(String[] words) {
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";

        HashSet<Character> r1 = new HashSet<>();
        HashSet<Character> r2 = new HashSet<>();
        HashSet<Character> r3 = new HashSet<>();

        for(char ch : row1.toCharArray()) r1.add(ch);
        for(char ch : row2.toCharArray()) r2.add(ch);
        for(char ch : row3.toCharArray()) r3.add(ch);

        ArrayList<String> al = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            char[] c = words[i].toCharArray();
            if(canForm(c, r1)) {
                al.add(words[i]);
            }
            else if(canForm(c, r2)) {
                al.add(words[i]);
            }
            else if(canForm(c, r3)) {
                al.add(words[i]);
            }
        }

        String[] res = new String[al.size()];
        for(int i=0; i<al.size(); i++) {
            res[i] = al.get(i);
        }
        return res;
    }

    public static boolean canForm(char[] c, HashSet<Character> hs) {
        for(char ch:c) {
            if(!hs.contains(ch)) {
                return false;
            }
        }
        return true;
    }
}
