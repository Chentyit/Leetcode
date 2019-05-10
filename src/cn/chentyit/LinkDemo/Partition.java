package cn.chentyit.LinkDemo;

public class Partition {

    private static ListNode partition(ListNode head, int x) {
        ListNode p1 = new ListNode(-1);
        ListNode p2 = new ListNode(-1);
        ListNode result = p1;
        ListNode buf = p2;
        while (head != null) {
            ListNode n = head.next;
            if (head.val < x) {
                p1.next = head;
                p1 = p1.next;
                p1.next = null;
            } else {
                p2.next = head;
                p2 = p2.next;
                p2.next = null;
            }
            head = n;
        }
        p1.next = buf.next;
        return result.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(2);
        f.next = null;
        e.next = f;
        d.next = e;
        c.next = d;
        b.next = c;
        a.next = b;
        a = partition(a, 3);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
