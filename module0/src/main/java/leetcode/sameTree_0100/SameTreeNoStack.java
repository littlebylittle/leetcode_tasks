package leetcode.sameTree_0100;

import java.util.Stack;

public class SameTreeNoStack {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(p);
        stack.push(q);

        while (!stack.isEmpty()) {
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();

            if (left == null && right == null) {
                continue;
            } else if (left == null || right == null || left.val != right.val) {
                return false;
            }

            stack.push(left.right);
            stack.push(right.right);
            stack.push(left.left);
            stack.push(right.left);
        }

        return true;
    }
}
