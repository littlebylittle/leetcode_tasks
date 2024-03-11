package leetcode.validateBinarySearchTree;

import leetcode.deepestLeavesSum.TreeNode;

public class ValidateBinSearchTree_0098 {
    public boolean isValidBST(/*nonNull*/TreeNode root) {
        return check(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    /**
     *                                                    5,
     *                                             /               \
     *                  4 (<<5 left, right>>-999999999),          100(leftMax<<+9999999999, >>>5 right, )
     *                  ,                                     /                  \
     *             null null,                   77(leftMaxx<<100, rightMin>>5)              157 (>>5, >>100) +
     *                      6 (<<77 >>5)         <<100, >>77           x                  y
     */

    boolean check(TreeNode node, long leftMax, long rightMin) {
        if(node == null) return true;
        //
        boolean correctNode = node.val < leftMax && node.val > rightMin;
        if(!correctNode) return false;
        return check(node.left, node.val, rightMin ) && check(node.right, leftMax, node.val);
    }
}
