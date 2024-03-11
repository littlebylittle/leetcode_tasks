package leetcode.binaryTreeLevelTraversal;


import java.util.ArrayList;
import java.util.List;

public class Traversal_0102 {
    private List<List<Integer>> myList = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return List.of();
        addToPq(root, 1);
        return myList;
    }

    private void addToPq(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if(level > myList.size()) {
            myList.add(new ArrayList<>());
        }
        List<Integer> levelList = myList.get(level-1);
        levelList.add(node.val);
        if(node.left!=null) {
            addToPq(node.left, level+1);
        }
        if(node.right!=null) {
            addToPq(node.right, level+1);
        }
    }
}
