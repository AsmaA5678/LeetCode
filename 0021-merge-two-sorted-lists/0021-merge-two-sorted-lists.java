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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode apointer=list1;
        ListNode bpointer=list2;
        ListNode newNode=  new ListNode(0);
        ListNode nextNode = newNode;
        while(apointer!=null && bpointer!=null){
            if(apointer.val<=bpointer.val){
                nextNode.next=apointer;
                nextNode=nextNode.next;
                apointer=apointer.next;
            }else if(apointer.val>bpointer.val){
                nextNode.next=bpointer;
                nextNode=nextNode.next;
                bpointer=bpointer.next;
            }
        }
        if(apointer!=null){
            nextNode.next=apointer;
        }
        if(bpointer!=null){
            nextNode.next=bpointer;
        }
        return newNode.next;
    }
}
