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
    private ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = reverseList(l1);
        ListNode head2 = reverseList(l2);
        ListNode head = new ListNode(0, null);
        ListNode temp = head;
        int carry = 0;
        while(head1 != null && head2 != null){
            int x = head1.val;
            int y = head2.val;
            int sum = (x + y + carry) % 10;
            carry = (x + y + carry) / 10;
            // System.out.println("X = " + x + ", Y = " + y + ", Carry = " + carry);
            ListNode newNode = new ListNode(sum);
            temp.next = newNode;
            temp = temp.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        while(head1 != null){
            int x = head1.val;
            int sum = (x + carry) % 10;
            carry = (x + carry) / 10;
            ListNode newNode = new ListNode(sum);
            temp.next = newNode;
            temp = temp.next;
            head1 = head1.next;
        }
        
        while(head2 != null){
            int y = head2.val;
            int sum = (y + carry) % 10;
            carry = (y + carry) / 10;
            ListNode newNode = new ListNode(sum);
            temp.next = newNode;
            temp = temp.next;
            head2 = head2.next;
        }
        if(carry == 1){
            ListNode newNode = new ListNode(1);
            temp.next = newNode;
            temp = temp.next;
        }
        return reverseList(head.next);
    }
}