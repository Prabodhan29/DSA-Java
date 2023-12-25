package com.Patterns;

//        1
//        3 2
//        4 5 6
//        10 9 8 7
//        11 12 13 14 15


public class Pattern7 {
    public static void main(String[] args) {
        int sum = 1;
        int diff;
        for(int i=0; i<=4; i++) {
            if(i % 2 == 0) {
                for(int j=0; j<=i; j++) {
                    System.out.print(sum + " ");
                    sum++;
                }

            }
            else {
                diff = sum + i;
                for(int j=0; j<=i; j++) {
                    System.out.print(diff + " ");
                    diff--;
                    sum++;
                }
            }
            System.out.println(" ");
        }
    }
}
