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
            count++;
            head = head.next;
        }
        return count;
    }
    private ListNode getNode(ListNode head, int n){
        while(n >= 1){
            head = head.next;
            n--;
        }
        return head;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        int n = getSize(head);
        int mid = n / 2;
        ListNode prevNode = getNode(head, mid - 1);
        ListNode midNode = getNode(head, mid);
        ListNode nextNode = getNode(head, mid + 1);
        prevNode.next = nextNode;
        return head;
    }
}