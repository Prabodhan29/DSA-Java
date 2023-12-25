package com.Arrays;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] weights = {3, 2, 2, 1};
        int limit = 3;
        System.out.println(numRescueBoats(weights, limit)); // 3 -> (1,2),(3),(2)
    }
    public static int numRescueBoats(int[] weights, int limit) {
        Arrays.sort(weights);

        int start = 0;
        int end = weights.length - 1;
        int count = 0;

        while(start <= end) {
            int sum = weights[start] +  weights[end];

            // pair the heaviest person with the lightest person
            if(sum <= limit) {
                count++;
                start++;
                end--;
            }
            // separate boat for the heaviest person
            else {
                count++;
                end--;
            }
        }

        return count;
    }
}
