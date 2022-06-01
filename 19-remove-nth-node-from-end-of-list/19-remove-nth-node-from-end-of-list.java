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
        int length = 0;
        
        ListNode current = head;
        
        // finding the length of the list
        
        while(current != null) {
            length += 1;
            current = current.next;
        }
        
        // if we have to delete the first node
        
        if(length == n) {
            return head.next;
        }
        
        // element to be deleted will be at (length - n)
        
        int i = 0;
        
        ListNode prev = null;
        current = head;
        
        while(i < length - n) {
            prev = current;
            current = current.next;
            i++;
        }
        
        // deleting the required node
        
        prev.next = current.next;
        
        return head;
    }
}