/********************************************************************

    Following is the representation of the Singly Linked List Node:

    class Node<T> {
        T data;
        Node<T> next;
        
        public Node(T data) {
            this.data = data;
        }
    }

********************************************************************/

public class Solution {
    public static Node<Integer> mergeSort(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        int length = getLength(head);
        Node<Integer> dummy = new Node<>(null);
        dummy.next = head;

        for (int step = 1; step < length; step *= 2) {
            Node<Integer> curr = dummy.next;
            Node<Integer> tail = dummy;

            while (curr != null) {
                Node<Integer> left = curr;
                Node<Integer> right = split(left, step);
                curr = split(right, step);

                tail.next = merge(left, right);
                while (tail.next != null) {
                    tail = tail.next;
                }
            }
        }

        return dummy.next;
    }

    private static int getLength(Node<Integer> head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    private static Node<Integer> split(Node<Integer> head, int n) {
        if (head == null) {
            return null;
        }
        for (int i = 1; i < n && head.next != null; i++) {
            head = head.next;
        }
        Node<Integer> rest = head.next;
        head.next = null;
        return rest;
    }

    private static Node<Integer> merge(Node<Integer> a, Node<Integer> b) {
        Node<Integer> dummy = new Node<>(null);
        Node<Integer> curr = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }

        if (a != null) {
            curr.next = a;
        } else {
            curr.next = b;
        }

        return dummy.next;
    }
}
