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
        ArrayList<Integer> entries = new ArrayList<>();

        while (head != null) {
            entries.add(head.val);
            head = head.next;
        }

        int len = entries.size();
        for (int i = 0; i < (int) Math.round(len / 2.0); i++) {
            if(entries.get(i) != entries.get(len - i - 1)) return false;
        }
        return true;
    }
}