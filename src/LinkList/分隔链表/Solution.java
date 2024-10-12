package LinkList.分隔链表;



class Solution {
    public ListNode partition(ListNode head, int x) {
        // 创建两个链表：一个保存小于 x 的节点，另一个保存大于等于 x 的节点
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);

        // 保留 before 和 after 链表的头节点，最后方便返回结果
        ListNode beforeHead = before;
        ListNode afterHead = after;

        ListNode cur = head;

        // 遍历原链表
        while (cur != null) {
            if (cur.val < x) {
                before.next = cur;  // 添加到小于 x 的链表
                before = before.next;
            } else {
                after.next = cur;   // 添加到大于等于 x 的链表
                after = after.next;
            }
            cur = cur.next;
        }

        after.next = null;  // 避免链表环
        before.next = afterHead.next;  // 连接两个链表

        return beforeHead.next;  // 返回新链表的头节点
    }
}
