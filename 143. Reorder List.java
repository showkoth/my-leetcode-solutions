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
    private ListNode getNode(ListNode head, int n){
        while(n >= 1){
            head = head.next;
            n--;
        }
        return head;
    }
    // private void print(ListNode head){
    //     while(head != null){
    //         System.out.println(head.val);
    //         head = head.next;
    //     }
    // }
    public void reorderList(ListNode head) {
        int n = getSize(head);
        int left = 0;
        int right = n - 1;
        while(left < n){
            ListNode leftNode = getNode(head, 0);
            // System.out.println("left node: " + leftNode.val);
            ListNode rightNode = getNode(head, right);
            // System.out.println("right node: " + rightNode.val);
            rightNode.next = leftNode.next;
            leftNode.next = rightNode;
            left += 2;
            head = head.next.next;
            right -= 2;
        }
        ListNode lastNode = getNode(head, n - 1);
        lastNode.next = null;
        // print(head);
    }
}