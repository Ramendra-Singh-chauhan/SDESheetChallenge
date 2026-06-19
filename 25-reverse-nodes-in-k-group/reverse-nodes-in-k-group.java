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
    ListNode reverse(ListNode current, ListNode end){
        ListNode prev = null;
        while(current !=end){
            ListNode temp = current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k==1){
            return head;
        }
        ListNode start = head;
        ListNode end = head;
        int index = k-1;
        while(index-- > 0 ){
            end = end.next;
            if (end==null) return head;
        }
        ListNode ans = reverseKGroup(end.next, k);
            reverse (start, end.next);
                start.next=ans;
        return end;

    }
}