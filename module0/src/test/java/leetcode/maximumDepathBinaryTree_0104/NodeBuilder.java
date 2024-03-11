package leetcode.maximumDepathBinaryTree_0104;

import java.util.LinkedList;
import java.util.Queue;

public class NodeBuilder {
    public static TreeNode builder(String data) {
        data = data.substring(1, data.length() - 1); // Remove '[' and ']'
        String[] values = data.split(",");
        if (values.length == 0 || values[0].equals("null")) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(values[0].trim()));
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (i < values.length && !values[i].trim().equals("null")) {
                current.left = new TreeNode(Integer.parseInt(values[i].trim()));
                queue.add(current.left);
            }
            i++;

            if (i < values.length && !values[i].trim().equals("null")) {
                current.right = new TreeNode(Integer.parseInt(values[i].trim()));
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }
}
