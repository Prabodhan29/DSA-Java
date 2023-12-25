package com.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/a/./b/../../c";
        System.out.println(simplifyPath(path)); // /c
    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        // to remove all the '/' present in the path string
        // as '/' is not needed
        // we only need to check '..'
        // if the path was - "/a/./b/../../c/"
        // then it will become - [a, ., b, .., .., c]
        String[] p = path.split("/");

        for(int i=0; i<p.length; i++) {
            // if the p array element is not null,
            // not ..,
            // and not ., then push that element in the stack
            if(!p[i].equals("") && !p[i].equals("..") && !p[i].equals(".")) {
                stack.push(p[i]);
            }

            // if it is equal to ..
            // pop that element
            // I am not using else statement
            // as I want to be clear with why am I popping the element
            else if(!stack.isEmpty() && p[i].equals("..")) {
                stack.pop();
            }
        }

        // if the stack is empty,
        // then we are at the home/root directory or "/"
        if(stack.isEmpty()) return "/";

        // we want to return the path present in stack
        // starting with /
        ArrayList<String> al = new ArrayList<>(stack);

        // "/" is used to create the starting slash
        String res = "/" + String.join("/", al);
        return res;
    }
}
