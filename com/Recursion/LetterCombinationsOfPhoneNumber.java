package com.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
        // [ad, ae, af, bd, be, bf, cd, ce, cf]
    }

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        int start = 0;
        String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuffer temp = new StringBuffer();

        if(digits.length() == 0) return res;

        m1(map, start, digits, temp, res);

        return res;
    }

    public static void m1(String[] map, int start, String digits, StringBuffer temp, List<String> res) {
        // base condition
        if(start == digits.length()) {
            res.add(temp.toString());
            return;
        }

        int number = digits.charAt(start) - '0'; // to convert '2' to 2
        String val = map[number]; // "abc" (if number becomes 2)

        for(char c : val.toCharArray()) {
            temp.append(c);
            m1(map, start+1, digits, temp, res);

            temp.deleteCharAt(temp.length()-1);
        }
    }
}
