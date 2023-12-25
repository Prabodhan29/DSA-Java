package com.BitManipulation;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        int n = 70;
        isEven(n);
    }
    public static void isEven(int n) {
        if((n & 1) == 0) {
            System.out.println("It is even");
        }
        else {
            System.out.println("It is odd");
        }
    }
}
