package com.String;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal)); // true
    }

    public static boolean rotateString(String s, String goal) {
        String res = s + s;
        if(s.length()==goal.length() && res.contains(goal)) {
            return true;
        }
        return false;
    }
}
