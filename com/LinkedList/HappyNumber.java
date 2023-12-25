package com.LinkedList;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19)); // true
        System.out.println(isHappy(12)); // false
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        // If we don't do this, then the below while loop will
        // never be executed as the condition is fast != slow
        // but at this stage fast = slow = n
        fast = sumOfSquareOfDigits(sumOfSquareOfDigits(fast));
        slow = sumOfSquareOfDigits(slow);

        // Now fast is two steps ahead
        // and slow is one step ahead
        while(fast != slow) {
            fast = sumOfSquareOfDigits(sumOfSquareOfDigits(fast));
            slow = sumOfSquareOfDigits(slow);
        }

        // cycle does not exist
        if(slow == 1) {
            return true;
        }

        // cycle exists
        return false;
    }

    public static int sumOfSquareOfDigits(int num) {
        int res = 0;
        while(num != 0) {
            int rem = num % 10;
            res = res + (rem*rem);
            num = num / 10;
        }
        return res;
    }
}
