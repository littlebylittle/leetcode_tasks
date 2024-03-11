package leetcode.reverseLinkedList_0206;

import java.util.*;

public class ReverseLinkedList_0206 {

//    public void voo() {
//        var a = new LinkedList<Object>();
//    }

    public ListNode reverseList_basedOnDeque(/*Nullable/**/ ListNode head) {
        if(head == null) return null;

        Deque<ListNode> q = new LinkedList<>();
        ListNode current = head;
        while(current != null) {
            q.push(current);
            current = current.next;
        }

        var newHead = q.pop();
        current = newHead;
        while(!q.isEmpty()) {
            var n = q.pop();
            current.next = n;
            current = n;
        }
        current.next = null;
        return newHead;
    }

    public ListNode reverseList_basedOnStack(/*Nullable/**/ ListNode head) {
        if(head == null) return null;
        Stack<ListNode> q = new Stack<>();
        ListNode current = head;
        while(current != null) {
            q.push(current);
            current = current.next;
        }

        var newHead = q.pop();
        current = newHead;
        while(!q.isEmpty()) {
            var n = q.pop();
            current.next = n;
            current = n;
        }
        current.next = null;
        return newHead;
    }


    public ListNode reverseList_recurs(/*Nullable/**/ ListNode head) {
        return recursion(null, head);
    }

    private ListNode recursion(/*not null*/ListNode left, ListNode right) {
        if(right == null) return left;

        final var newRight = right.next;
        right.next = left;
        return recursion(right, newRight);
    }

    public ListNode reverseList(ListNode current) {
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
