import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();

        System.out.print("List: \n");
        solution.printLinkedList(head);

        ListNode reversedHead = solution.reverseList(head);
        System.out.print("Reverse list: \n");
        solution.printLinkedList(reversedHead);

        // simple reverse
        LinkedList<Integer> simpleReverse = new LinkedList<>(List.of(10, 20, 30, 40, 50));
        Collections.reverse(simpleReverse);

        System.out.println("Simple reverse : \n" + simpleReverse);

    }
}