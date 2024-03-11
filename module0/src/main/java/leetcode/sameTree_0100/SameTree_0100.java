package leetcode.sameTree_0100;

public class SameTree_0100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return traverse(p, q);
    }

    private boolean traverse(TreeNode l, TreeNode r) {
        if(l == null && r == null) {
            return true;
        } else if((l != null && r == null) || (l==null && r != null)) {
            return false;
        }

        return l.val==r.val&&traverse(l.left, r.left) && traverse(l.right, r.right);
    }
}
