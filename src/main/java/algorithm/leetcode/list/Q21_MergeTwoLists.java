package algorithm.leetcode.list;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Q21_MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        } else if (null == l2) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);
        ListNode pre = preHead;

        while (null != l1 && null != l2) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }

            pre = pre.next;
        }

        pre.next = l1 == null ? l2 : l1;

        return preHead.next;
    }

    public static void main(String[] args) {
        Q21_MergeTwoLists mergeTwoLists = new Q21_MergeTwoLists();
        ListNode result = mergeTwoLists.mergeTwoLists(ListNode.newInstance(), ListNode.newInstance());
        result.print();
        System.out.println();
        result = mergeTwoLists.mergeTwoLists2(ListNode.newInstance(), ListNode.newInstance());
        result.print();
    }
}
