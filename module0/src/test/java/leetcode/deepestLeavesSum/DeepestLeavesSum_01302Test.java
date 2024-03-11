package leetcode.deepestLeavesSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeepestLeavesSum_01302Test {
    @Test
    void name() {
        TreeNode head = NodeBuilder.builder("[1,2,3,4,5,null,6,7,null,null,null,null,8]");
        int i = new DeepestLeavesSum_01302().deepestLeavesSum(head);
        assertEquals(15, i);
    }
}