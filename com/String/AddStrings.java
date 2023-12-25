package com.String;

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "128";
        String num2 = "16";
        System.out.println(addStrings(num1, num2)); // 144
    }

    public static String addStrings(String num1, String num2) {
        String res = "";
        int i = num1.length()-1;
        int j = num2.length()-1;

        int carry = 0;

        while(i>=0 || j>=0 || carry != 0) {
            int i_value = 0;
            if(i>=0) {
                i_value = num1.charAt(i) - '0';
            }

            int j_value = 0;
            if(j>=0) {
                j_value = num2.charAt(j) - '0';
            }

            int sum = i_value + j_value + carry;
            res = (sum%10) + res;
            carry = sum/10;

            i--;
            j--;
        }
        return res;
    }
}
