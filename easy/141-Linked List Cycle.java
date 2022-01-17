/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> records = new HashSet<>();

        while (head != null) {
            if(!records.add(head)) return true;
            head = head.next;
        }
        return false;
    }
}