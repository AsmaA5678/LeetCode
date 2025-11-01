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
    public ListNode reverseList(ListNode head) {
        ListNode previous=null;
        return reverseList( head, previous);
    }
    public ListNode reverseList(ListNode head, ListNode previous) {
        if(head==null){
            return previous;
        } 
        ListNode nextNode= head.next;
        head.next=previous;
        previous=head;
        head=nextNode;  
        return reverseList(head, previous);    
    }
}