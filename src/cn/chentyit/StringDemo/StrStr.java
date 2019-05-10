package cn.chentyit.StringDemo;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/17 22:22
 * @Version 1.0
 */
public class StrStr {

    private static int strStr(String haystack, String needle) {
        if (haystack.length() == 0) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        for (int i = 0; i <= h.length - n.length; i++) {
            if (h[i] == n[0]) {
                int j = 0;
                for (; j < n.length; j++) {
                    if (h[i + j] != n[j]) {
                        break;
                    }
                }
                if (j == n.length) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(haystack, needle));
    }
}
