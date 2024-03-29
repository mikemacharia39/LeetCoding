package javasolutionsforalgorithms.leettests.linkedLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.

 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 */
public class ReverseLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode (int val) {
            this.val = val;
        }
    }

    /**
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        // 1 -> 2 -> 3 -> null
        // null <- 1 <- 2 <- 3

        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next; // 2
            // this is the actual reversal
            head.next = prev;         // null

            prev = head;              // 1

            head = next;              // 2
        }

        return prev;
    }

    /**
     * Brute force
     * @param head ListNode
     * @return ListNode
     */
    public ListNode reverseList2(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        Collections.reverse(list);

        Iterator<Integer> it = list.iterator();

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (it.hasNext()) {
            ListNode node = new ListNode(it.next());
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next;
    }

}
