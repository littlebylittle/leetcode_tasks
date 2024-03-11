package leetcode.reorderList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorderList_0143Test {
    @Test
    void name() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        new ReorderList_0143().reorderList(head);
        assertEquals(4, head.next.val);

    }

    @Test
    void name2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        new ReorderList_0143().reorderList(head);
        assertEquals(5, head.next.val);

    }
}