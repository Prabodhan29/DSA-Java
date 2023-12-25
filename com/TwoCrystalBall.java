package com;

import java.util.Arrays;

public class TwoCrystalBall {
    public static void main(String[] args) {
        int[] arr = new int[100];
        insertOneIntoArray(arr, 89);

        System.out.println(m1(arr)); // 89
    }

    public static void insertOneIntoArray(int[] arr, int ballBreakingFloor) {
        Arrays.fill(arr, 0);
        for(int i=ballBreakingFloor; i<arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static int m1(int[] arr) {
        int arr_jumps = (int) Math.sqrt(arr.length);
        int res = 0;
        int firstBallBreakingFloor = 0;

        for(int i=0; i<arr.length; i=i+arr_jumps) {
            if(arr[i] == 1) {
                // found the floor from which the ball will break
                firstBallBreakingFloor = i;
                break;
            }
        }

        int previous_jump = firstBallBreakingFloor - arr_jumps;
        for(int j=previous_jump; j<firstBallBreakingFloor; j++) {
            if(arr[j] == 1) {
                res = j; // found the exact floor from which the ball will break
                break;
            }
        }

        return res;
    }
}
