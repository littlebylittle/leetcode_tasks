package leetcode.deepestLeavesSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeBuilderTest {
    @Test
    void name() {
        TreeNode head = NodeBuilder.builder("[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14]");
        int leftVal = head.left.val;
        int rightVal = head.right.val;
        assertEquals(1, leftVal);
        assertEquals(2, rightVal);
    }

    @Test
    void name02() {
        TreeNode head = NodeBuilder.builder("[1,2,3,4,5,null,6,7,null,null,null,null,8]");
        int val = head.left.left.left.val;
        assertEquals(7, val);

        val = head.right.right.right.val;
        assertEquals(8, val);
    }
}