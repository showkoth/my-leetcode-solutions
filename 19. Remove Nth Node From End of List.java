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
    private int getSize(ListNode head){
        int count = 1;
        ListNode current = head;
        while(current.next != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = getSize(head);
        int index = sz - n + 1;
        if(index == 1) {
            head = head.next;
            return head;
        }
        ListNode temp = head;
        for(int i=2; i < index; i++) {
          if(temp.next != null) {
            temp = temp.next;
          }
    }
     temp.next = temp.next.next;
        return head;
    }
}