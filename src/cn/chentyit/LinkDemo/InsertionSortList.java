package cn.chentyit.LinkDemo;

public class InsertionSortList {

    private static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p1 = new ListNode(0);
        p1.next = head;
        ListNode p2 = head;
        while (p2.next != null) {
            if (p2.val > p2.next.val) {
                ListNode buf = p2.next;
                p2.next = buf.next;
                ListNode pre = p1;
                while (pre.next.val < buf.val) {
                    pre = pre.next;
                }
                buf.next = pre.next;
                pre.next = buf;
            } else {
                p2 = p2.next;
            }
        }
        return p1.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(7);
        g.next = null;
        f.next = g;
        e.next = f;
        d.next = e;
        c.next = d;
        b.next = c;
        a.next = b;
        a = insertionSortList(a);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
