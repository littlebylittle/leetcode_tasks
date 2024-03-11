package leetcode.maximumDepathBinaryTree_0104;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepth_0104Test {

    @Test
    void name() {
        TreeNode head = NodeBuilder.builder("[1,2,3,4,5,null,6,7,null,null,null,null,8]");
        int i = new MaximumDepth_0104().maxDepth(head);
        assertEquals(15, i);
    }

    @Test
    void name001() {
        TreeNode head = NodeBuilder.builder("[1,null,8]");
        int i = new MaximumDepth_0104().maxDepth(head);
        assertEquals(2, i);
    }
}