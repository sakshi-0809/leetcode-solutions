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
        if(head == null)
            return null;
        
        ListNode prev = head;
        
        ListNode newHead = head;
        
        head = head.next;
        
        while(head != null) {
            if(prev.val == head.val) {
                prev.next = head.next;
                head = head.next;
            }
            
            else {
                prev = head;
                head = head.next;
            }
        }
        
        return newHead;
    }
}