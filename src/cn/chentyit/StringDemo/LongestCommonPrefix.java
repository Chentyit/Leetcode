package cn.chentyit.StringDemo;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/19 21:38
 * @Version 1.0
 */
public class LongestCommonPrefix {

    private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            sb.append(strs[0].charAt(i));
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(sb.toString())) {
                    return sb.deleteCharAt(sb.toString().length() - 1).toString();
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"a"};
        System.out.println(longestCommonPrefix(strs));
    }
}
