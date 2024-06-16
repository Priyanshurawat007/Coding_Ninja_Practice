public class Solution {
    public static Node firstNode(Node head) {
        // Initialize slow and fast pointers
        Node slow = head;
        Node fast = head;

        // Detect cycle (if any)
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break; // Cycle detected
            }
        }

        // No cycle found
        if (fast == null || fast.next == null) {
            return null;
        }

        // Move slow back to the head
        slow = head;

        // Find the start of the cycle
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // Return the start of the cycle
    }
}
