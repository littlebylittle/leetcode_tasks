package leetcode.maximumDepathBinaryTree_0104;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Map;

public class MaximumDepth_0104 {
    public int maxDepth(TreeNode root) {
        if(root==null) {
            return 0;
        }

        return maxDepth(root, 1);
    }

    int maxDepth(TreeNode node, int accumulator) {
        int lDepth = accumulator;
        if(node.left != null) {
            lDepth = maxDepth(node.left, accumulator+1);
        }
        int rDepth = accumulator;
        if(node.right != null) {
            rDepth = maxDepth(node.right, accumulator+1);
        }
        return lDepth>rDepth?lDepth:rDepth;
    }

    //https://raygun.com/blog/java-performance-optimization-tips/#primitives
    public int maxDepth_(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxDepth = 0;
        LinkedList<Map.Entry<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new AbstractMap.SimpleEntry<>(root, 1));

        while (!queue.isEmpty()) {
            Map.Entry<TreeNode, Integer> current = queue.poll();
            TreeNode node = current.getKey();
            int currentDepth = current.getValue();

            maxDepth = Math.max(maxDepth, currentDepth);

            if (node.left != null) {
                queue.add(new AbstractMap.SimpleEntry<>(node.left, currentDepth + 1));
            }
            if (node.right != null) {
                queue.add(new AbstractMap.SimpleEntry<>(node.right, currentDepth + 1));
            }
        }

        return maxDepth;
    }
}
