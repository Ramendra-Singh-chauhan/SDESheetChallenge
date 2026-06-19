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
    ListNode ReverseSecondHalf (ListNode headA){
        ListNode prev = null;
        ListNode current = headA;
        while(current !=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
       
    }
    public boolean isPalindrome(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       //isse apan ko middle mil jayega
       while(fast.next !=null && fast.next.next !=null){
        slow=slow.next;
        fast=fast.next.next;
       }
      ListNode newHead = ReverseSecondHalf(slow.next);
      ListNode first = head;
      ListNode second = newHead;
      while(second !=null){
        if (first.val !=second.val){
            ReverseSecondHalf(newHead);
            return false;
        }
        first = first.next;
        second = second.next;
      }
            ReverseSecondHalf(newHead);    
            return true;
    }
}