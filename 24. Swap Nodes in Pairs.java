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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode cur = head;
        ListNode pre = dummy;
        while(cur != null && cur.next != null){
            pre.next = cur.next;
            cur.next = cur.next.next;
            pre.next.next = cur;
            
            pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}