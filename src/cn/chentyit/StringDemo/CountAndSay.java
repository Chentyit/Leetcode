package cn.chentyit.StringDemo;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/18 22:18
 * @Version 1.0
 */
public class CountAndSay {

    private static String countAndSay(int n) {
        String[] strings = new String[30];
        strings[0] = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            char c = strings[i - 1].charAt(0);
            int count = 1;
            int j = 1;
            for (; j < strings[i - 1].length(); j++) {
                if (strings[i - 1].charAt(j) == c) {
                    count++;
                } else {
                    sb.append(count).append(c);
                    c = strings[i - 1].charAt(j);
                    count = 1;
                }
            }
            sb.append(count).append(c);
            strings[i] = sb.toString();
        }
        return strings[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(6));
    }
}
