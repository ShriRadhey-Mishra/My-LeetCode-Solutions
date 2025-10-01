package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode617 {
    public static void main(String[] args) {
        Leetcode617 obj = new Leetcode617();
        // Tree 1
        TreeNode tree1 = new TreeNode(1,
                new TreeNode(3,
                        new TreeNode(5),
                        null),
                new TreeNode(2)
        );

// Tree 2
        TreeNode tree2 = new TreeNode(2,
                new TreeNode(1,
                        null,
                        new TreeNode(4)),
                new TreeNode(3,
                        null,
                        new TreeNode(7))
        );

        levelOrder(tree1);
        levelOrder(tree2);
        TreeNode merged = obj.mergeTrees(tree1, tree2);
        levelOrder(merged);
    }

    public static void levelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            System.out.print(temp.val + " ");
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }

        System.out.println();
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        root1.val += root2.val;

        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }
}
