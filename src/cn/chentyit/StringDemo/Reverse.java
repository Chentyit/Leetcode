package cn.chentyit.StringDemo;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/12 22:16
 * @Version 1.0
 */
public class Reverse {

    private static int reverse(int x) {
        int rev = 0;
        while (x == 0) {
            rev = rev * 10 + rev % 10;
            x /= 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            rev = 0;
        }
        return rev;
    }

    public static void main(String[] args) {
        int x = 123456789;
        System.out.println(reverse(x));
    }
}
