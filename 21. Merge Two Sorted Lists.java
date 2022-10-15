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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode head = new ListNode(0, null);
        ListNode tmp = head;
        
        while(cur1 != null && cur2 != null) {
            if(cur1.val <= cur2.val) {
                tmp.next = cur1;
                cur1 = cur1.next;
            }
            else {
                tmp.next = cur2;
                cur2 = cur2.next;
            }
            tmp = tmp.next;
                
        }
        while(cur1 != null) {
            tmp.next = cur1;
                cur1 = cur1.next;
            tmp = tmp.next;
        }
        
        while(cur2 != null) {
            tmp.next = cur2;
                cur2 = cur2.next;
            tmp = tmp.next;
        }
        return head.next;
    }
}