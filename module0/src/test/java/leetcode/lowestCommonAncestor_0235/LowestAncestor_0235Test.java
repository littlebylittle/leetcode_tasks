package leetcode.lowestCommonAncestor_0235;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestAncestor_0235Test {
    @Test
    void name() {
        TreeNode root = NodeBuilder.builder("[6,2,8,0,4,7,9,null,null,3,5]");
        TreeNode treeNode = new LowestAncestor_0235().lowestCommonAncestor(root, new TreeNode(3), new TreeNode(5));
        assertEquals(4, treeNode.val);
    }

    @Test
    void name5() {
        TreeNode root = NodeBuilder.builder("[6,2]");
        TreeNode treeNode = new LowestAncestor_0235().lowestCommonAncestor(root, new TreeNode(6), new TreeNode(2));
        assertEquals(6, treeNode.val);
    }

    @Test
    void name5a() {
        TreeNode root = NodeBuilder.builder("[6,2]");
        TreeNode treeNode = new LowestAncestor_0235().lowestCommonAncestor(root, new TreeNode(2), new TreeNode(6));
        assertEquals(6, treeNode.val);
    }

    @Test
    void name2() {
        TreeNode root = NodeBuilder.builder("[6,2,8,0,4,7,9,null,null,3,5]");
        TreeNode treeNode = new LowestAncestor_0235().lowestCommonAncestor(root, new TreeNode(4), new TreeNode(2));
        assertEquals(2, treeNode.val);
    }

    @Test
    void name01() {
        TreeNode root = NodeBuilder.builder("[6,2,8,0,4,7,9,null,null,3,5]");
        TreeNode treeNode = new LowestAncestor_0235().lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8));
        assertEquals(6, treeNode.val);
    }
}