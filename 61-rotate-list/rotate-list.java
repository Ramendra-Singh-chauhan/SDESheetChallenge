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
    public ListNode FindNthNode(ListNode temp , int k){
        int count = 1;
        while(temp != null){
            if(count == k) return temp;
            count++;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) {
        return head;
        }
        int length = 1;
        ListNode tail = head;
        while(tail.next!= null){
            length++;
            tail=tail.next;
        }
        if(k%length == 0) return head;
        k=k%length;
        tail.next=head;
        ListNode newLastNode = FindNthNode(head, length-k);
        head=newLastNode.next;
        newLastNode.next=null;
        return head;
    }
}