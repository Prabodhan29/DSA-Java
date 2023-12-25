package com.String;

public class NumberOfSegments {
    public static void main(String[] args) {
        String s = "Hello, my name is ,, ,, , ,   ";
        System.out.println(countSegments(s)); // 8
    }

    public static int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int c = 0;
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (str[i] != "") {
                c++;
            }
        }
        return c;
    }
}
