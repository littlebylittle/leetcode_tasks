package leetcode.deepestLeavesSum;

public class DeepestLeavesSum_01302 {
    private int maxLevel = 0;
    private int sum = 0;

    public int deepestLeavesSum(final TreeNode root) {
        calculateSumAtLevel(root,0);
        return sum;
    }

    private void calculateSumAtLevel(final TreeNode root, final int level){

        if(root == null) return;
        if(level > maxLevel){
            sum = 0;
            maxLevel = level;
        }
        if(level == maxLevel){
            sum = sum + root.val;
        }
        calculateSumAtLevel(root.left,level+1);
        calculateSumAtLevel(root.right,level+1);
    }


    //  Definition for a binary tree node.

}
