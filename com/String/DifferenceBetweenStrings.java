package com.String;

import java.util.Arrays;

public class DifferenceBetweenStrings {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t)); // e
    }

    public static char findTheDifference(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        int x = 0;
        int y = 0;
        while(x<c1.length && y<c2.length) {
            if(c1[x] != c2[y]) {
                return c2[y];
            }
            x++;
            y++;
        }
        return c2[c2.length-1];

    }
}
