package algorithm.leetcode.list;

/**
 * 相交链表
 * 编写一个程序，找到两个单链表相交的起始节点。
 */
public class Q160_GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        while (null != l1) {
            while (null != l2) {
                if (l1 == l2) {
                    return l1;
                } else {
                    l2 = l2.next;
                }
            }

            l1 = l1.next;
            l2 = headB;
        }

        return null;
    }

    public static void main(String[] args) {
        Q160_GetIntersectionNode getIntersectionNode = new Q160_GetIntersectionNode();
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);

        ListNode headC = new ListNode(8);
        headC.next = new ListNode(4);
        headC.next.next = new ListNode(5);

        headA.next.next = headC;
        headB.next.next.next = headC;

        System.out.println(getIntersectionNode.getIntersectionNode(headA, headB).val);
    }
}
