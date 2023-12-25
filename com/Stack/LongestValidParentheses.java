package com.Stack;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = ")()())()";
        System.out.println(longestValidParentheses(s)); // 4
    }

    public static int longestValidParentheses(String s) {
        Stack<Character> char_stack = new Stack<>();
        Stack<Integer> index_stack = new Stack<>();

        // to avoid NullPointerException while calculating length inside the for loop.
        index_stack.push(-1);
        int length = 0;

        for(int i=0; i<s.length(); i++) {
            // '(' found
            if(s.charAt(i) == '(') {
                char_stack.push('(');
                index_stack.push(i);
            }

            // ')' found
            else {

                // ')' found but char_stack also has a '(' -> valid parentheses
                if(!char_stack.isEmpty() && char_stack.peek() == '(') {
                    char_stack.pop();
                    index_stack.pop();
                    length = Math.max(length, i-index_stack.peek());
                }

                // not valid parentheses -> only ')' found and no '('.
                else {
                    index_stack.push(i);
                }
            }
        }

        return length;
    }
}
