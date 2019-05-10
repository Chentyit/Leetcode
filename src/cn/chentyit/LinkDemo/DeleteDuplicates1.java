package cn.chentyit.LinkDemo;

public class DeleteDuplicates1 {

    private static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = head;
        dummy.next = head;

        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);
        g.next = null;
        f.next = g;
        e.next = f;
        d.next = e;
        c.next = d;
        b.next = c;
        a.next = b;
        a = deleteDuplicates(a);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}
