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
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> visited= new HashSet<>();
        ListNode current=head;
        ListNode previous=null;
        while(current!=null){
            if(visited.contains(current.val)){
                previous.next=current.next;
            } else{
                visited.add(current.val);
                previous=current;
            }
            current=current.next;
        }
        return head;
    }
}


