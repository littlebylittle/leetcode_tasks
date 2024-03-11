package leetcode.subTreeOfAnotherTree_0572;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtreeOfAnotherTree_Recursive_0572Test {
    @Test
    void name001() {
        TreeNode head = NodeBuilder.builder("[3,4,5,1,2,null,null,null,null,0]");
        TreeNode subTree = NodeBuilder.builder("[4,1,2]");
        var res = new SubtreeOfAnotherTree_Recursive_0572().isSubtree(head, subTree);
        assertEquals(false, res);

    }

    @Test
    void name002() {
        TreeNode head = NodeBuilder.builder("[3,4,5,1,null,2]");
        TreeNode subTree = NodeBuilder.builder("[3,1,2]");
        var res = new SubtreeOfAnotherTree_Recursive_0572().isSubtree(head, subTree);
        assertEquals(false, res);
    }

    @Test
    void name003() {
        TreeNode head = NodeBuilder.builder("[3,4,5,1,2]");
        TreeNode subTree = NodeBuilder.builder("[4,1,2]");
        var res = new SubtreeOfAnotherTree_Recursive_0572().isSubtree(head, subTree);
        assertEquals(true, res);
    }
}