package com.Mathematics;

public class LCM {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        lcm(x, y); // 30
    }

    public static void lcm(int x, int y) {
        int lcm = product(x, y) / hcf(x, y);
        System.out.println("The LCM is " + lcm);
    }

    public static int hcf(int x, int y) {
        int hcf = 0;

        int min = Math.min(x, y);
        int diff = Math.abs(x - y);
        int loop_condition = Math.min(min, diff);

        for (int i = 1; i <= loop_condition; i++) {
            if (x % i == 0 && y % i == 0) {
                hcf = Math.max(hcf, i);
            }
        }
        return hcf;
    }

    public static int product(int x, int y) {
        return x * y;
    }
}
