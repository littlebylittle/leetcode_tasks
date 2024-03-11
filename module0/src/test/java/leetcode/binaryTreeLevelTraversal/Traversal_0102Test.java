package leetcode.binaryTreeLevelTraversal;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Traversal_0102Test {
    @Test
    void name01() {
        TreeNode root = NodeBuilder.builder("[3,9,20,null,null,15,7]");
        List<List<Integer>> lists = new Traversal_0102().levelOrder(root);
        assertEquals(List.of(List.of(3), List.of(9,20), List.of(15,7)), lists);
    }


    @Test
    void name123() {
        TreeNode root = NodeBuilder.builder("[1,2,3]");
        List<List<Integer>> lists = new Traversal_0102().levelOrder(root);
        assertEquals(List.of(List.of(1), List.of(2,3)), lists);
    }
}