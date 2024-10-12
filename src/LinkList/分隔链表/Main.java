package LinkList.分隔链表;

public class Main {
    public static void main(String[] args) {
        // 创建测试链表 1 -> 4 -> 3 -> 2 -> 5 -> 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        // 设置分割值 x = 3
        int x = 3;

        // 调用 partition 方法
        Solution solution = new Solution();
        ListNode result = solution.partition(head, x);

        // 打印分割后的链表
        printList(result);
    }

    // 打印链表的方法
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}