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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left=head;
        ListNode right=head;
        ListNode newNode=new ListNode(0);
        newNode.next=head;
        ListNode previous= newNode;
        for(int i=1;i<n;i++){
            right=right.next;
        }
        while(right.next!=null){
            previous=left;
            left=left.next;
            right=right.next;
        }
        previous.next=left.next;
        return newNode.next;

        
        
    }
}