package com.Mathematics;

public class MaxPointsOnALine {
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        System.out.println(maxPoints(points)); // 4
    }

    public static int maxPoints(int[][] points) {
        if(points.length <= 2) return points.length;
        int res = 0;

        for(int A=0; A<points.length; A++) {
            for(int B=A+1; B<points.length; B++) {
                int points_on_line = 0; // needs to reset for each A and B
                for(int C=0; C<points.length; C++) {
                    if(liesOnTheLine(points[A], points[B], points[C]))
                        points_on_line++;
                }
                res = Math.max(res, points_on_line);
            }
        }

        return res;
    }

    public static boolean liesOnTheLine(int[] A, int[] B, int[] C) {
        // A[0][1] = A point with coordinates (x1,y1)
        // B[0][1] = B point with coordinates (x2,y2)
        // C[0][1] = C point with coordinates (x,y)
        // And we need to check whether C lies on the line AB

        // see Image 1
       final double LHS = (C[1] - A[1]) * (B[0] - A[0]);
       final double RHS = (B[1] - A[1]) * (C[0] - A[0]);

        return LHS == RHS;
    }
}
