/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    private int size(ListNode head){
        ListNode cur = head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = size(headA);
        int sizeB = size(headB);
        int sizeDiff = Math.abs(sizeA - sizeB);
        if(sizeA > sizeB){
            while(sizeDiff-- > 0){
                headA = headA.next;
            }
        }
        else{
            while(sizeDiff-- > 0){
                headB = headB.next;
            }
        }
        while(headA != null && headB != null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
        
    }
}