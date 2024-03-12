package leetcode.removeNthNodeFromEnd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void name01() {
        ListNode head = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        head.next = listNode2;
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;
        ListNode listNode4 = new ListNode(4);
        listNode3.next = listNode4;
        ListNode listNode5 = new ListNode(5);
        listNode4.next = listNode5;


        ListNode listNode = new Solution().removeNthFromEnd(head, 2);
        assertNotNull(listNode);
    }

    @Test
    void name02() {
        ListNode head = new ListNode(1);
        ListNode listNode = new Solution().removeNthFromEnd(head, 1);
        assertNull(listNode);
    }
}