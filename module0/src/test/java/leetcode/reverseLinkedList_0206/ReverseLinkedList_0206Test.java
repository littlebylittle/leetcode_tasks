package leetcode.reverseLinkedList_0206;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedList_0206Test {
    @Test
    void name() {
        var head = new ListNode(0, new ListNode(1, new ListNode(2, null)));
        var res = new ReverseLinkedList_0206().reverseList_basedOnDeque(head);
        assertEquals(2, res.val);
    }


    @Test
    void name_reverseList_recurs() {
        var head = new ListNode(0, new ListNode(1, new ListNode(2, null)));
        var res = new ReverseLinkedList_0206().reverseList_recurs(head);
        assertEquals(2, res.val);
    }

}