package com.String;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord1(s)); // 4
        System.out.println(lengthOfLastWord(s)); // 4
    }

    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        String res = str[str.length-1];
        return res.length();
    }

    public static int lengthOfLastWord1(String s) {
        int length = 0;

        for(int i=s.length()-1; i>=0; i--) {

            // if whitespace is not present, increment length
            if(s.charAt(i) != ' ') {
                length++;
            }

            // if whitespace is present
            else {
                // but return length only if length is more than 0
                // that is, we have seen last word.
                if(length > 0) return length;
            }
        }
        return length;
    }
}
