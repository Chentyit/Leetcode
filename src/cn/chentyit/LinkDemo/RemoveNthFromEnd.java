package cn.chentyit.LinkDemo;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/21 21:41
 * @Version 1.0
 */
public class RemoveNthFromEnd {

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode right = head;
        ListNode left = head;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        if (right == null) {
            head = head.next;
            return head;
        }
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return head;
    }

    public static void main(String[] args) {

    }
}
