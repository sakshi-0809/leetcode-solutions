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
        if(head == null || head.next == null)
            return head;
        
        ListNode prev = null;
        ListNode next = head.next;
        
        while(head != null) {
            head.next = prev;
            prev = head;
            head = next;
            
            if(head != null)
                next = head.next;
        }
        
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        // finding the middle of the linked list
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // reversing the second half of the list
        
        ListNode newHead = reverseList(slow.next);
        
        slow.next = null;
        
        // comparing the first half and second half of the list
        
        while(head != null && newHead != null) {
            if(head.val != newHead.val)
                return false;
            
            head = head.next;
            newHead = newHead.next;
        }
        
        return true;
    }
}