package com.practive;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(longestSubstring(input));
    }

    public static int longestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Move the left pointer to avoid duplicate characters
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
            
        }
        String longestSu = s.substring(0,maxLength); 
        System.out.println(longestSu);
        return maxLength;
    }
}