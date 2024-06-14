public class Solution {
    public static Node removeKthNode(Node head, int K) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= K + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
