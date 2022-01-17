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

    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> records = new HashSet<Integer>();
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            if(records.add(current.val)) {
                prev = current;

            } else {
                prev.next = current.next;
            }

            current = current.next;
        }
        return head;
    }
}