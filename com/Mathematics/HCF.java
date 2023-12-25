package com.Mathematics;

public class HCF {
    public static void main(String[] args) {
        int x = 120;
        int y = 124;
        System.out.println(gcd1(x, y)); // 4
        System.out.println(gcd2(x, y)); // 4
    }

    public static int gcd1(int x, int y) {
        int ans = 0;
        for(int i=1; i<=Math.min(x, y); i++) {
            if(x%i==0 && y%i==0) {
                ans = Math.max(ans, i);
            }
        }
        return ans;
    }
    public static int gcd2(int x, int y) {
        int ans = 0;

        if(x == y) return x;

        int min = Math.min(x, y);
        int diff = Math.abs(x - y);
        int loop_condition = Math.min(min, diff);

        for (int i = 1; i <= loop_condition; i++) {
            if (x % i == 0 && y % i == 0) {
                ans = Math.max(ans, i);
            }
        }
        return ans;
    }
}
