package algorithm.leetcode.list;

/**
 * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序
 */
public class Q148_SortList {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left != null && right != null) {
            if (left.val < right.val) {
                h.next = left;
                left = left.next;
            } else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left != null ? left : right;
        return res.next;
    }

    public static void main(String[] args) {
        Q148_SortList sortList = new Q148_SortList();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(100);
        listNode.next.next = new ListNode(80);
        listNode.next.next.next = new ListNode(90);
        listNode.next.next.next.next = new ListNode(66);
        listNode.next.next.next.next.next = new ListNode(120);

        listNode.print();
        System.out.println();
        ListNode result = sortList.sortList(listNode);
        result.print();
    }
}
