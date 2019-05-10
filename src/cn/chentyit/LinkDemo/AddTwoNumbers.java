package cn.chentyit.LinkDemo;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/28 21:17
 * @Version 1.0
 */
public class AddTwoNumbers {

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode r = new ListNode(0);
        ListNode b = r;
        int z = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int buf = x + y + z;
            z = buf / 10;
            b.next = new ListNode(buf % 10);
            b = b.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (z > 0) {
            b.next = new ListNode(z);
        }
        return r.next;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(2);
        ListNode b1 = new ListNode(4);
        ListNode c1 = new ListNode(3);
        ListNode a2 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode c2 = new ListNode(4);
        c1.next = null;
        b1.next = c1;
        a1.next = b1;
        c2.next = null;
        b2.next = c2;
        a2.next = b2;
        a1 = addTwoNumbers(a1, a2);
        while (a1 != null) {
            System.out.println(a1.val);
            a1 = a1.next;
        }
    }
}
