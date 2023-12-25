package com.String;

public class SubstringOfLengthThreeWithDistinctCharacters {
    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(countGoodSubstrings(s)); // 1
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        for(int i=0; i<=s.length()-3; i++) {
            if(s.charAt(i) != s.charAt(i+1) && // 1st and 2nd character should not be equal
                    s.charAt(i) != s.charAt(i+2) && // 1st and 3rd character should not be equal
                    s.charAt(i+1) != s.charAt(i+2)) { // 2nd and 3rd character should not be equal
                count++;
            }
        }
        return count;
    }
}
