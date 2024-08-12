import java.util.LinkedList;

public class Delete_Node_in_a_LinkedList_237 {
    //There is a singly-linked list head, and we want to delete a node node in it.
    //
    //You are given the node to be deleted node. You will not be given access to the first node of head.
    //
    //All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
    //
    //Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
    //
    //The value of the given node should not exist in the linked list.
    //The number of nodes in the linked list should decrease by one.
    //All the values before node should be in the same order.
    //All the values after node should be in the same order.
    //Custom testing:
    //
    //For the input, you should provide the entire linked list head and the node to be given node.
    // node should not be the last node of the list and should be an actual node in the list.

    //We will build the linked list and pass the node to your function.

    //The output will be the entire list after calling your function.
    // https://leetcode.com/problems/delete-node-in-a-linked-list/description/

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public void deleteNode(ListNode node) {


        ListNode previousNode = null;

        while (node != null && node.next != null){
            node.val = node.next.val;
            previousNode = node;
            node = node.next;
        }

        if (previousNode != null) {
            previousNode.next = null;
        }

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        // Example usage

        ListNode head = new ListNode(4);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(9);

        head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Linked list before deletion:");
        printList(head);

        Delete_Node_in_a_LinkedList_237 solution = new Delete_Node_in_a_LinkedList_237();
        solution.deleteNode(second);

        System.out.println("Linked list after deletion:");
        printList(head);

    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

