package cn.chentyit.LinkDemo;

import java.util.HashSet;
import java.util.Set;

public class DetectCycle {

    private static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode k = head.next;
        ListNode m = head;
        while (true) {
            if (k == m) {
                while (m.next != head) {
                    head = head.next;
                    m = m.next;
                }
                return head;
            }
            if (k.next == null || k.next.next == null) {
                return null;
            }
            k = k.next.next;
            m = m.next;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        g.next = b;
        f.next = g;
        e.next = f;
        d.next = e;
        c.next = d;
        b.next = c;
        a.next = b;
        a = detectCycle(a);
        System.out.println(a.val);
    }
}
