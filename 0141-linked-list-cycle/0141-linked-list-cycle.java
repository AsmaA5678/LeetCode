/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode a = head;
        ListNode b = head.next;

        while (a != b) {
            if (b == null || b.next == null) {
                return false;
            }
            a = a.next;
            b = b.next.next;
        }
        return true;
    }
}