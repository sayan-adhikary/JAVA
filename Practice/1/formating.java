/*Definition for singly Linked List
class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}
*/
class Solution {
    /*
     * Approach :-
     * 
     * 1. Create an ArrayList to store all node values.
     * 
     * 2. Traverse each linked list using the next pointer.
     * 
     * 3. For every list:
     * - Traverse its child chain.
     * - Store each node's value in the ArrayList.
     * 
     * 4. Continue until all nodes from all levels
     * have been visited.
     * 
     * 5. Sort the ArrayList to obtain values in
     * ascending order.
     * 
     * 6. Create a new linked list using the sorted values.
     * 
     * 7. Connect nodes using the child pointer while
     * constructing the flattened list.
     * 
     * 8. Return the head of the newly created flattened list.
     * 
     * Time Complexity: O(N log N)
     * Space Complexity: O(N)
     */

    private ListNode convertArrToLinkedList(List<Integer> arr) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        for (int i = 0; i < arr.size(); i++) {
            temp.child = new ListNode(arr.get(i));

            temp = temp.child;
        }

        return dummyNode.child;
    }

    public ListNode flattenLinkedList(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        while (head != null) {
            ListNode t2 = head;

            while (t2 != null) {
                arr.add(t2.val);

                t2 = t2.child;
            }
            head = head.next;
        }

        Collections.sort(arr);

        return convertArrToLinkedList(arr);
    }
}