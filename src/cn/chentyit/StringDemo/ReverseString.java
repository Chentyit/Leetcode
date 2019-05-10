package cn.chentyit.StringDemo;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/12 22:10
 * @Version 1.0
 */
public class ReverseString {

    private static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char buf = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = buf;
        }

        for (char c : s) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }
}
