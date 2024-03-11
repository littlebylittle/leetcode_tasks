package leetcode.lowestCommonAncestor_0235;

public class LowestAncestor_0235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode left, TreeNode right) {
        if(left.val > right.val) {
            TreeNode temp = left;
            left = right;
            right = temp;
        }

        while(root.val != left.val && root.val != right.val) { //changing root
            if(root.val > left.val && root.val > right.val) {
                root = root.left;
            } else if (root.val < left.val && root.val < right.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return root;
    }
}
