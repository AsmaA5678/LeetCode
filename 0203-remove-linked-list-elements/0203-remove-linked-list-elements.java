/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Base case: if the list is empty, return null
        if (head == null) {
            return null;
        }

        // Recurse on the rest of the list
        head.next = removeElements(head.next, val);

        // If current node's value equals val, skip it
        if (head.val == val) {
            return head.next; // remove current node
        } else {
            return head; // keep current node
        }
    }
}
