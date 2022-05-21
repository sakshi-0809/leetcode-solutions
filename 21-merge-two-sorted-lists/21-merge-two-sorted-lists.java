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
        if(list1 == null)
            return list2;
        
        if(list2 == null)
            return list1;
        
        ListNode head = new ListNode();
        
        ListNode prev = head;
        
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            
            prev = prev.next;
        }
        
        if(list1 != null)
            prev.next = list1;
        else 
            prev.next = list2;
        
        return head.next;
    }
}