package com.String;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "UDDDUU";
        System.out.println(judgeCircle(moves)); // true
    }

    public static boolean judgeCircle(String moves) {
        // robot is starting from origin
        int x = 0;
        int y = 0;

        for(int i=0; i<moves.length(); i++) {
            if(moves.charAt(i) == 'U') y++;

            if(moves.charAt(i) == 'D') y--;

            if(moves.charAt(i) == 'R') x++;

            if(moves.charAt(i) == 'L') x--;
        }

        // robot came back to origin
        if(x == 0 && y == 0) return true;

        return false;
    }
}
