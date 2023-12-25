package com.String;

public class StringFormatting {
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        System.out.println(licenseKeyFormatting(s, k)); // 5F3Z-2E9W
    }

    public static String licenseKeyFormatting(String s, int k) {
        if(s.length() == 0) {
            return "";
        }

        String s1 = s.replace("-", "");
        String str = s1.toUpperCase();

        StringBuffer sb = new StringBuffer();
        int count = 0;

        for(int i=str.length()-1; i>=0; i--) {
            sb.append(str.charAt(i));
            count++;

            if(i != 0 && count == k) {
                sb.append("-");
                count = 0;
            }
        }

        sb.reverse();
        return sb.toString();
    }
}
