package LinkList.排序链表;

// 链表节点的定义
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode sortList(ListNode head) {
        // 基本情况：如果链表为空或只有一个元素
        if (head == null || head.next == null) {
            return head;
        }

        // 使用快慢指针找到链表的中间节点，并切断链表
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;  // 切断链表

        // 递归排序两个子链表
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // 合并排序后的两个子链表
        return merge(l1, l2);
    }

    // 合并两个排序好的链表
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        // 将剩余的节点连接到合并后的链表中
        if (l1 != null) {
            p.next = l1;
        } else {
            p.next = l2;
        }

        return dummy.next;
    }
}
