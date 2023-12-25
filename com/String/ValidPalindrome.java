package com.String;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s)); // true
    }

    public static boolean validPalindrome(String s) {
        if(s.length()==1) {
            return true;
        }
        if(isPalindrome(s)) {
            return true;
        }

        int start = 0;
        int end = s.length()-1;
        while(start<=end) {
            if(s.charAt(start) != s.charAt(end)) {
                break;
            }
            start++;
            end--;
        }

        StringBuffer sb1 = new StringBuffer(s);
        StringBuffer sb2 = new StringBuffer(s);

        sb1.deleteCharAt(start);
        sb2.deleteCharAt(end);

        return (isPalindrome(sb1.toString()) || isPalindrome(sb2.toString()));
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
