package cn.chentyit.StringDemo;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/15 22:01
 * @Version 1.0
 */
public class IsPalindrome {

    private static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) || !Character.isAlphabetic(s.charAt(i))) {
                s = s.replace(String.valueOf(s.charAt(i)), "");
            }
        }
        s= s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ab@a";
        System.out.println(isPalindrome(s));
    }
}
