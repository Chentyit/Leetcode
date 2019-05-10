package cn.chentyit.LinkDemo;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/23 21:18
 * @Version 1.0
 */
public class MergeTwoLists {

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode head = node;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        if (l1 == null) {
            head.next = l2;
        } else {
            head.next = l1;
        }
        return node.next;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode b1 = new ListNode(2);
        ListNode c1 = new ListNode(4);
        c1.next = null;
        b1.next = c1;
        a1.next = b1;
        ListNode a2 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode c2 = new ListNode(4);
        c2.next = null;
        b2.next = c2;
        a2.next = b2;
        a1 = mergeTwoLists(a1, a2);
        while (a1 != null) {
            System.out.println(a1.val);
            a1 = a1.next;
        }
    }
}
