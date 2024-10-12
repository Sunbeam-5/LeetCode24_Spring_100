package LinkList.分隔链表;



class Solution {
    public ListNode partition(ListNode head, int x) {
        int index = 0;
        ListNode cur = head;
        ListNode list = new ListNode(0);

        // System.out.println(index);
        // return list;
        cur = head;
        while (cur != null) {
            if (cur.val < x) {
                list.val = cur.val;
                list = list.next;
            }
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            if (cur.val >= x) {
                list.val = cur.val;
                list = list.next;
            }
            cur = cur.next;
        }
        return list;
    }
}