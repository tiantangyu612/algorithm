package algorithm.leetcode.list;

/**
 * 链表节点
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode newInstance() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        return head;
    }

    public void print() {
        ListNode curr = this;
        boolean head = true;
        while (curr != null) {
            if (head) {
                System.out.print(curr.val);
                head = false;
            } else {
                System.out.print(" -> " + curr.val);
            }
            curr = curr.next;
        }
    }
}