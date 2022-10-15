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
    private int size(ListNode head){
        int count = 1;
        ListNode current = head;
        while(current.next != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public ListNode middleNode(ListNode head) {
        int size = size(head);
        ListNode current = head;
        for(int i = 0; i <= size/2; i++){
            if(i == size/2) return current;
            current = current.next;
        }
        return current;
    }
}