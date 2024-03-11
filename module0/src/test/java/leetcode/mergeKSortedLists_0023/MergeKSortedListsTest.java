package leetcode.mergeKSortedLists_0023;

import org.junit.jupiter.api.Test;

import static leetcode.mergeKSortedLists_0023.ParseUtils.parseInput;
import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {
    @Test
    void name() {
        ListNode[] input = parseInput("[[],[],[],[],[4,7],[5]]");
        assertEquals(6, input.length);
        ListNode listNode = new MergeKSortedLists().mergeKLists(input);
        assertEquals(listNode.next.next.val, 7);
    }
}