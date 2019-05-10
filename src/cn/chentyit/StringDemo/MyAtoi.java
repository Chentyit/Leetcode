package cn.chentyit.StringDemo;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/16 23:01
 * @Version 1.0
 */
public class MyAtoi {

    private static int myAtoi(String str) {
        str = str.trim();
        int flag = 1;
        int index = 0;
        if (str.length() == 0) {
            return 0;
        }
        if (!Character.isDigit(str.charAt(0))) {
            if (str.charAt(0) == '-') {
                flag = -1;
            } else if (str.charAt(0) == '+') {
                flag = 1;
            } else {
                return 0;
            }
            index++;
        }
        long sum = 0;
        for (int i = index; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum = sum * 10 + (str.charAt(i) - '0');
                if (sum > Integer.MAX_VALUE && flag == 1) {
                    return Integer.MAX_VALUE;
                } else if (sum > Integer.MAX_VALUE && flag == -1) {
                    return Integer.MIN_VALUE * -1;
                }
            } else {
                break;
            }
        }
        sum *= flag;
        return (int)sum;
    }

    public static void main(String[] args) {
        String str = "2147483648";
        System.out.println(myAtoi(str));
    }
}
