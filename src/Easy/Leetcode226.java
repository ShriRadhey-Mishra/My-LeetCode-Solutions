package Easy;

import java.util.Queue;
import java.util.LinkedList;

public class Leetcode226 {
    public static void main(String[] args) {
        Leetcode226 obj = new Leetcode226();
        TreeNode tree = new TreeNode(2, new TreeNode(7, new TreeNode(9), new TreeNode(6)), new TreeNode(2, new TreeNode(3), new TreeNode(1)));
        TreeNode inverted = obj.invertTree(tree);
    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.remove();
            if (current.left != null) queue.add(current.left);
            if (current.right!= null) queue.add(current.right);
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
        }

        return root;
    }
}
