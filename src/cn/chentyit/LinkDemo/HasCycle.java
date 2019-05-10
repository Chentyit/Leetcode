package cn.chentyit.LinkDemo;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/26 21:52
 * @Version 1.0
 */
public class HasCycle {

    private static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (true) {
            if (fast == slow) {
                return true;
            }
            if (fast.next == null || fast.next.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(-4);
        d.next = null;
        c.next = d;
        b.next = c;
        a.next = b;
        System.out.println(hasCycle(a));

    }
}
