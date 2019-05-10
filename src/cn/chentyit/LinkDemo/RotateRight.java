package cn.chentyit.LinkDemo;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/5/1 22:17
 * @Version 1.0
 */
public class RotateRight {

    private static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int len = 0;
        ListNode p = head;
        ListNode r = null;
        while (p != null) {
            if (p.next == null) {
                r = p;
            }
            len++;
            p = p.next;
        }
        assert r != null;
        r.next = head;
        p = head;
        k = len - (k % len);
        for (int i = 0; i < k; i++) {
            p = p.next;
            r = r.next;
        }
        r.next = null;
        return p;
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
        a = rotateRight(a, 2);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
