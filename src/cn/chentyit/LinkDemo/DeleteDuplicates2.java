package cn.chentyit.LinkDemo;

import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/5/2 22:20
 * @Version 1.0
 */
public class DeleteDuplicates2 {

    private static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = new ListNode(-1);
        p.next = head;
        ListNode left = p;
        ListNode right = p.next;
        int count = 0;
        while (right != null) {
            if (right.next != null && right.val == right.next.val) {
                right = right.next;
                count++;
            } else if (count > 0) {
                left.next = right.next;
                right = right.next;
                count = 0;
            } else {
                left = left.next;
                right = right.next;
            }
        }
        return p.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);
        g.next = null;
        f.next = g;
        e.next = f;
        d.next = e;
        c.next = d;
        b.next = c;
        a.next = b;
        a = deleteDuplicates(a);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
