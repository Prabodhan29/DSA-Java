package com.Mathematics;

public class Triangular_number {
    public static void main(String[] args) {
        int n = 4;
        TriangularNumber(n);
    }

    private static void TriangularNumber(int n) {
        int res = 0;
        int n1 = n; // as we are decrementing n in the while loop. So n1 stores the original value of n
        while(n >= 0) {
            res = res + n;
            n--;
        }
        System.out.println("The " + n1 + "th triangular number is: " + res);
        System.out.println("The triangle representation is: ");
        printTriangularNumber(n1);
    }

    private static void printTriangularNumber(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
