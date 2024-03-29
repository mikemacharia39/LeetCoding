package javasolutionsforalgorithms.revision_v2.leetcode.linkedlist;

/**
 * <a href="https://leetcode.com/explore/learn/card/recursion-i/253/conclusion/2382/">...</a>
 *
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 */
public class MergeTwoLists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return l1;
        }

        ListNode merged = new ListNode(0);
        ListNode prehead = merged;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                merged.next = l2;
                l2 = l2.next;
            } else {
                merged.next = l1;
                l1 = l1.next;
            }

            merged = merged.next;
        }

        while (l1 != null) {
            merged.next = l1;
            l1 = l1.next;
            merged = merged.next;
        }

        while (l2 != null) {
            merged.next = l2;
            l2 = l2.next;
            merged = merged.next;
        }

        return prehead.next;
    }
}
