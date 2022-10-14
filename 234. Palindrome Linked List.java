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
    
    public boolean isPalindrome(ListNode head) {
        List<Integer> al = new ArrayList<>();
        ListNode tmp = head;
        while(tmp != null){
            al.add(tmp.val);
            tmp = tmp.next;
        }
        int i = al.size() - 1;
        while(head != null){
            // System.out.println(al.get(i));
            if(head.val != al.get(i)) return false;
            i--;
            head = head.next;
        }
        return true;
    }
}