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
    public ListNode removeElements(ListNode head, int val) {
        ListNode currentNode = head;
        ListNode previousNode = null;

        while(currentNode != null) {
            if(currentNode.val == val) {
                if (previousNode != null) {
                    previousNode.next = currentNode.next;
                } else {
                    head = currentNode.next;
                }

                currentNode = currentNode.next;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }


        }

        return head;
    }
}