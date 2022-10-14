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
        int sz = 0;
        while(head.next != null){
            sz++;
            head = head.next;
        }
        return sz + 1;
    }
    private ListNode getNode(ListNode head, int k){
        while(k > 1){
            head = head.next;
            k--;
        }
        return head;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int n = getSize(head);
        ListNode first = getNode(head, k);
        ListNode last = getNode(head, n - k + 1);
        int tmp = first.val;
        first.val = last.val;
        last.val = tmp;
        return head;
    }
}









