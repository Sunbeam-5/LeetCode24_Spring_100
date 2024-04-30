package LinkList.反转链表;

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode preLeft = dummy;

        // 移动 preLeft 指针到反转部分的前一个节点
        for (int i = 0; i < left - 1; i++) {
            preLeft = preLeft.next;
        }

        ListNode prev = preLeft.next;
        ListNode curr = prev.next;

        // 反转 left 到 right 的链表节点
        for (int i = 0; i < right - left; i++) {
            prev.next = curr.next;
            curr.next = preLeft.next;
            preLeft.next = curr;
            curr = prev.next;
        }

        return dummy.next;
    }
}
