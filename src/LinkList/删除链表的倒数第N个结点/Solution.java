package LinkList.删除链表的倒数第N个结点;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        // System.out.println(count);
        // return head;
        cur = dummy;
        for (int i = 0; i < count - n; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;

        return dummy.next;
    }
}