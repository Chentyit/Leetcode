package cn.chentyit.LinkDemo;

public class ReorderList {

    private static ListNode reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = slow.next;
        slow.next = null;
        slow = head;
        ListNode rev = new ListNode(-1);

        while (fast != null) {
            ListNode buf = new ListNode(fast.val);
            buf.next = rev.next;
            rev.next = buf;
            fast = fast.next;
        }

        rev = rev.next;
        while (rev != null) {
            ListNode buf = new ListNode(rev.val);
            buf.next = slow.next;
            slow.next = buf;
            slow = slow.next.next;
            rev = rev.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        g.next = null;
        f.next = g;
        e.next = f;
        d.next = e;
        c.next = d;
        b.next = c;
        a.next = b;
        a = reorderList(a);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
