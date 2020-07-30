package algorithm.leetcode.list;

/**
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 * 示例:
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 */
public class Q92_ReverseBetween {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode curr = head;
        ListNode prev = null;

        while (m > 1) {
            prev = curr;
            curr = curr.next;
            m--;
            n--;
        }

        ListNode con = prev, tail = curr;

        return prev;
    }

    public static void main(String[] args) {
        ListNode curr = reverseBetween(ListNode.newInstance(), 2, 4);
        curr.print();
    }
}
