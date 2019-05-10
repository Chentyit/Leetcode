package cn.chentyit.StringDemo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/13 21:44
 * @Version 1.0
 */
public class FirstUniqChar {

    private static int firstUniqChar(String s) {
        if (s.length() <= 0) {
            return -1;
        }
        LinkedList<Character> list = new LinkedList<>();
        Set<Character> set = new HashSet<>();
        list.add(s.charAt(0));
        set.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                int index = list.indexOf(s.charAt(i));
                if (index >= 0) {
                    list.remove(index);
                }
            } else {
                list.add(s.charAt(i));
            }
        }
        if (list.size() == 0) {
            return -1;
        }
        return s.indexOf(list.getFirst());
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
