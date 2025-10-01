package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode111 {
    public static void main(String[] args) {
        Leetcode111 obj = new Leetcode111();
        TreeNode root = new TreeNode(10,
                new TreeNode(20,
                        new TreeNode(40,
                                new TreeNode(80),
                                new TreeNode(90)),
                        new TreeNode(50)),
                new TreeNode(30,
                        new TreeNode(60),
                        new TreeNode(70)));
        System.out.println(obj.minDepth(root));
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.remove();
                if (curr.left == null && curr.right == null) return depth;
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }

            depth++;
        }

        return depth;
    }
}
