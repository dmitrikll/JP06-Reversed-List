public class Solution {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode reverseResult = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reverseResult;
    }

    public void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}