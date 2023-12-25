package com.String;

public class FindKBeautyOfNumber {
    public static void main(String[] args) {
        int num = 240;
        int k = 2;
        System.out.println(divisorSubstrings(num, k)); // 2
    }

    public static int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num); // convert 240 to "240"
        int count = 0;

        for(int i=0; i<=s.length()-k; i++) {
            // "24" -> 1st iteration
            // "40" -> 2nd iteration
            String temp_string = s.substring(i, i+k);

            // "24" to 24 and "40" to 40
            int divisor = Integer.valueOf(temp_string);

            // to avoid dividing by 0, skip to next iteration
            if(divisor == 0) continue;

            // if num is completely divisible by divisor, then increment count
            if(num % divisor == 0) count++;
        }

        return count;
    }
}
