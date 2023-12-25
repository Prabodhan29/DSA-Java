package com.String;

import java.util.HashSet;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAAbbbbb";
        System.out.println(numJewelsInStones(jewels, stones)); // 4
    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hs = new HashSet<>();
        for(char c:jewels.toCharArray()) {
            hs.add(c);
        }

        int count = 0;
        for(int i=0; i<stones.length(); i++) {
            if(hs.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
