package cn.chentyit.LinkDemo;

public class ReverseBetween {

    private static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode result = new ListNode(-1);
        result.next = head;
        ListNode pre = result;
        for (int i = 1; i < m; i++) {
            pre = pre.next;
        }
        head = pre.next;
        for (int i = m; i < n; i++) {
            ListNode b = head.next;
            head.next = b.next;
            b.next = pre.next;
            pre.next = b;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        e.next = null;
        d.next = e;
        c.next = d;
        b.next = null;
        a.next = b;
        a = reverseBetween(a, 2, 4);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
