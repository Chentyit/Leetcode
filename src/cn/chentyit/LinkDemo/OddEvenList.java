package cn.chentyit.LinkDemo;

public class OddEvenList {

    private static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode buf = even;
        while (odd.next != null && buf.next != null) {
            odd.next = buf.next;
            odd = odd.next;
            buf.next = odd.next;
            buf = buf.next;
        }
        odd.next = even;
        return head;
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
        a = oddEvenList(a);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
