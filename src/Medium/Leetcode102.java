package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode102 {
    public static void main(String[] args) {
        Leetcode102 obj = new Leetcode102();
        TreeNode root = new TreeNode(10, new TreeNode(20, new TreeNode(40, new TreeNode(80), new TreeNode(90)), new TreeNode(50)), new TreeNode(30, new TreeNode(60), new TreeNode(70)));
        System.out.println(obj.levelOrder(root));
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> order = new ArrayList<>();
        if (root == null) return order;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                level.add(current.val);
                if (current.left != null) queue.add(current.left);
                if (current.right!=null) queue.add(current.right);
            }

            order.add(level);
        }

        return order;
    }
}
