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
     * 1. Create a dummy node to serve as the starting point of the
     * merged linked list.
     * 
     * 2. Use a temporary pointer (temp) that initially points to
     * the dummy node.
     * 
     * 3. Traverse both linked lists simultaneously while neither
     * list is exhausted.
     * 
     * 4. Compare the values of the current nodes:
     * - If head1.val <= head2.val, attach head1 to the merged list
     * and move head1 forward.
     * - Otherwise, attach head2 to the merged list
     * and move head2 forward.
     * 
     * 5. Move the temp pointer forward after each insertion.
     * 
     * 6. After the loop, one of the lists may still contain nodes.
     * Attach the remaining nodes directly to the merged list.
     * 
     * 7. Return dummyNode.next, which points to the head of the
     * merged sorted linked list.
     * 
     * Example:
     * 
     * List1: 1 -> 3 -> 5
     * List2: 2 -> 4 -> 6
     * 
     * Merged List:
     * 1 -> 2 -> 3 -> 4 -> 5 -> 6
     * 
     * Time Complexity: O(N + M)
     * where N and M are the lengths of the two linked lists.
     * 
     * Space Complexity: O(1)
     * (No extra space is used except the dummy node.)
     */

    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode dumyNode = new ListNode(-1);
        ListNode temp = dumyNode;

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if (head1 != null) {
            temp.next = head1;
        } else {
            temp.next = head2;
        }

        // Return merged list
        return dumyNode.next;
    }
}
