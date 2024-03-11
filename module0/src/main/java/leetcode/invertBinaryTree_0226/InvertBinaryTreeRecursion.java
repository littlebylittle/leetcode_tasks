package leetcode.invertBinaryTree_0226;

public class InvertBinaryTreeRecursion {
    public TreeNode invertTree(TreeNode root) {
        reverse(root);
        return root;
    }

    public void reverse(TreeNode current) {
        if(current == null) return;

        var temp = current.left;
        current.left = current.right;
        current.right = temp;
        reverse(current.left);
        reverse(current.right);
    }
}
