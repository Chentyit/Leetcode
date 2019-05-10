package cn.chentyit.StringDemo;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/14 22:06
 * @Version 1.0
 */
public class IsAnagram {

    private static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
}
