package com.String;

import java.util.Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs)); // fl
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        Arrays.sort(strs);

        // we only take first and last strings and convert them into char arrays
        // because first[] will always be a subset of last[]. That's why, we
        // sorted the array so that we could ignore the useless strings.
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        // as first is the smaller array
        for(int i=0; i<first.length; i++) {
            if(first[i] == last[i]) {
                sb.append(first[i]);
            }
            else {
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
