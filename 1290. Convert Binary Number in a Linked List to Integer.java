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
        int count = 0; 
        while(head != null){
            head = head.next;
            count++;
        }
        return count;
    }
    public int getDecimalValue(ListNode head) {
        int n = getSize(head);
        int i = n - 1;
        int decimal = 0;
        while(head != null){
            decimal += head.val * Math.pow(2,i--);
            head = head.next;
        }
        return decimal;
    }
}