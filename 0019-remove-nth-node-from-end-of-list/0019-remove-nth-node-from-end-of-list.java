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
    private int count = 0; // counter for tracking position from the end

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Recursive helper returns the possibly new head
        head = remove(head, n);
        return head;
    }

    private ListNode remove(ListNode node, int n) {
        if (node == null) return null;  // base case

        node.next = remove(node.next, n);  // recurse to the end

        count++;  // increment counter when unwinding
        if (count == n) {
            // skip this node
            return node.next;
        }
        return node;  // keep node
    }
}
