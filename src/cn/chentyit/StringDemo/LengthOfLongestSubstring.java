package cn.chentyit.StringDemo;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    private static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastOccurred = new HashMap<>();
        int start = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (lastOccurred.containsKey(s.charAt(i)) && lastOccurred.get(s.charAt(i)) >= start) {
                start = lastOccurred.get(s.charAt(i)) + 1;
            }
            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
            }
            lastOccurred.put(s.charAt(i), i);
        }

        return maxLength;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
