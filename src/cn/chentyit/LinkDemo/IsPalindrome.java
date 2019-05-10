package cn.chentyit.LinkDemo;

import java.util.Stack;

/**
 * @author Chentyit
 */
public class IsPalindrome {

    private static boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode buf = head;
        while (buf != null) {
            stack.add(buf);
            buf = buf.next;
        }
        int deep = stack.size();
        buf = head;
        while (stack.size() > deep / 2) {
            if (buf.val != stack.pop().val) {
                return false;
            }
            buf = buf.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(1);
        d.next = null;
        c.next = d;
        b.next = c;
        a.next = b;
        ListNode z = new ListNode(1);
        System.out.println(isPalindrome(null));
    }
}
