public class Solution {

    public static boolean detectCycle(Node head) {
          if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // move slow pointer by 1 step
            fast = fast.next.next;  // move fast pointer by 2 steps

            if (slow == fast) {     // cycle detected
                return true;
            }
        }

        return false;  // no cycle detected
    }
}
