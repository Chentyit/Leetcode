package cn.chentyit.LinkDemo;

import java.util.Stack;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/22 22:12
 * @Version 1.0
 */
public class ReverseList {

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode point = head;
        Stack<ListNode> nodeStack = new Stack<>();
        while (point != null) {
            nodeStack.add(point);
            point = point.next;
        }
        point = head = nodeStack.pop();
        while (nodeStack.size() != 0) {
            point.next = nodeStack.pop();
            point.next.next = null;
            point = point.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        e.next = null;
        d.next = e;
        c.next = d;
        b.next = c;
        a.next = b;
        a = reverseList(a);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
