package com.String;

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "HeLLooo";
        System.out.println(toLowerCase(s)); // hellooo
    }

    public static String toLowerCase(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                char c = Character.toLowerCase(s.charAt(i));
                sb.append(c);
            }
            else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
