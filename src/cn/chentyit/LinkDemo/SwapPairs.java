package cn.chentyit.LinkDemo;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/29 22:29
 * @Version 1.0
 */
public class SwapPairs {

    private static ListNode swapPairs(ListNode head) {
        ListNode r = new ListNode(-1);
        ListNode b = r;
        r.next = head;
        while (r.next != null && r.next.next != null) {
            ListNode t = r.next;
            ListNode n = t.next;
            r.next = n;
            t.next = n.next;
            n.next = t;
            r = t;
        }
        return b.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        d.next = null;
        c.next = d;
        b.next = c;
        a.next = b;
        a = swapPairs(a);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
