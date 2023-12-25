package com.String;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s)); // leotcede
    }

    public static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length - 1;

        while(start < end) {
            if(isVowel(c[start]) && isVowel(c[end])) {
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;
            }
            else if(!isVowel(c[start])) {
                start++;
            }
            else if (!isVowel(c[end])) {
                end--;
            }
        }
        return new String(c);
    }

    public static boolean isVowel(char c) {
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
    }
}
