package com.BinarySearch;

public class nthMagicalNumber {
    public static void main(String[] args) {
        int n = 4;
        int a = 2;
        int b = 3;
        System.out.println(nthMagicalNumber1(n, a, b)); // 6
        System.out.println(nthMagicalNumber1(n, a, b)); // 6
    }

    public static int nthMagicalNumber1(int n, int a, int b) {
        // given if the number is too large return answer as
        // modulo of 10^9 + 7
        long mod = (long) (Math.pow(10, 9) + 7);

        // the magical number cannot be lower than the minimum of
        // a and b
        long start = Math.min(a, b);
        long end = (long) Math.min(a, b) * n;

        long LCM = lcm(a, b);

        while(start <= end) {
            long mid = start + (end-start)/2;
            if((mid/a) + (mid/b) - (mid/LCM) < n) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return (int) (start % mod);
    }

    // find lcm
    public static long lcm(int a, int b) {
        long lcm = (a*b)/hcf(a, b);
        return lcm;
    }

    // find hcf
    public static long hcf(int a, int b) {
        if(a == b) return a;

        int min = Math.min(a, b);
        int diff = Math.abs(a - b);
        int loop_condition = Math.min(min, diff);
        long ans = 0;

        for(int i=1; i<=loop_condition; i++) {
            if(a%i==0 && b%i==0) {
                ans = Math.max(ans, i);
            }
        }
        return ans;
    }

    public static int nthMagicalNumber2(int n, int a, int b) {
        int i = 1;
        int number = Math.min(a, b);
        int ans = 0;

        while(i <= n) {
            if(number % a == 0 || number % b == 0) {
                if(i == n) {
                    ans = number;
                    break;
                }
                i++;
            }
            number++;
        }

        return ans;
    }
}
