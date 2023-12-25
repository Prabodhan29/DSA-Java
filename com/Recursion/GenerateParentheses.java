package com.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
        // [((())), (()()), (())(), ()(()), ()()()]
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        int open = 0;
        int close = 0;

        m1(res, sb, open, close, n);

        return res;
    }

    public static void m1(List<String> res, StringBuffer sb, int open, int close, int n) {
        // base condition
        if(sb.length() == 2*n) { // 2n -> n open + n close parentheses
            res.add(sb.toString());
            return;
        }

        // to add '('
        if(open < n) {
            sb.append("(");
            m1(res, sb, open+1, close, n);
            sb.deleteCharAt(sb.length()-1);
        }

        // to add ')'
        if(close < open) {
            sb.append(")");
            m1(res, sb, open, close+1, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}




