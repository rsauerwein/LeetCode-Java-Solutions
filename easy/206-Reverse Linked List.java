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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;


        ListNode previous = null;
        ListNode result = new ListNode();
        while (head != null) {
            result = new ListNode(head.val, previous);

            previous = result;
            head = head.next;
        }

        return result;
    }
}