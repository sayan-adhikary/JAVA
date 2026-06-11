/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    /*
     * Approach :-
     * 
     * 1. Start traversing the linked list from the head.
     * 
     * 2. Find the Kth node from the current position using
     * the getKthNode() helper function.
     * 
     * 3. If fewer than K nodes remain:
     * - Connect the remaining nodes to the last processed group.
     * - Leave them unchanged and stop processing.
     * 
     * 4. Store the node after the Kth node (nextNode)
     * and temporarily disconnect the current group.
     * 
     * 5. Reverse the current group of K nodes using
     * the reverseLinkedList() helper function.
     * 
     * 6. If this is the first group:
     * - Update the head to the new group's head.
     * Otherwise:
     * - Connect the previous reversed group to
     * the current reversed group.
     * 
     * 7. Update prevLast to point to the tail of the
     * newly reversed group.
     * 
     * 8. Move temp to the start of the next group and
     * repeat the process.
     * 
     * 9. Return the modified head after all groups
     * have been processed.
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     * 
     * helperFunction :-
     * 
     * getKthNode():
     * Returns the Kth node starting from the given node.
     * Used to determine whether a complete group of K nodes exists.
     * 
     * reverseLinkedList():
     * Reverses a linked list and returns the new head
     * of the reversed list.
     */

    private ListNode getKthNode(ListNode temp, int k) {
        k--;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;
        while (temp != null) {
            ListNode kThNode = getKthNode(temp, k);
            if (kThNode == null) {
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                break;
            }
            ListNode nextNode = kThNode.next;
            kThNode.next = null;
            reverseLinkedList(temp);
            if (temp == head) {
                head = kThNode;
            } else {
                prevLast.next = kThNode;
            }
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }
}