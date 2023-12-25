package com.String;

import java.util.Stack;

public class ReverseIndividualWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s)); // s'teL ekat edoCteeL tsetnoc
        System.out.println(reverseWords1(s)); // s'teL ekat edoCteeL tsetnoc
    }

    public static String reverseWords(String s) {
        char[] c = s.toCharArray();

        int i = 0;
        for(int j = 0; j < c.length; j++) {
            if(c[j] == ' ') {
                // we cannot take j as j is ' '. So we take j-1
                reverseArray(c, i, j-1);
                i = j + 1;
            }
        }

        // because the last word is not reversed as we are doing
        // j-1 in the above for loop.
        reverseArray(c, i, c.length-1);
        return new String(c);
    }

    public static void reverseArray(char[] arr, int i, int j) {
        while(i < j) {
            // swap
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static String reverseWords1(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<s.length(); i++) {

            // if no whitespace is present, add those elements to stack
            if(s.charAt(i) != ' ') {
                stack.push(s.charAt(i));
            }

            // whitespace found
            else {
                // append all the elements of stack in sb
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                // add space after each word
                sb.append(" ");
            }
        }

        // for the last word, no need to add space
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return new String(sb);
    }
}
