package LinkList.删除链表中的重复元素;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-111);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;

        while (cur != null) {
            boolean isDuplicate = false;

            // 检查当前节点是否与下一个节点值相同
            while (cur.next != null && cur.val == cur.next.val) {
                isDuplicate = true;
                cur = cur.next;
            }

            // 如果当前节点是重复节点，则跳过该节点
            if (isDuplicate) {
                prev.next = cur.next;
            } else {
                prev = prev.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}