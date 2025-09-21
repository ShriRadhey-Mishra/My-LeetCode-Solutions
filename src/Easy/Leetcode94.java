package Easy;

import java.util.ArrayList;
import java.util.List;

public class Leetcode94 {
    public static void main(String[] args) {
        Leetcode94 obj = new Leetcode94();
        TreeNode root = new TreeNode(10, new TreeNode(20, new TreeNode(40, new TreeNode(80), new TreeNode(90)), new TreeNode(50)), new TreeNode(30, new TreeNode(60), new TreeNode(70)));
        System.out.println(obj.inorderTraversal(root));

    }
    private void inorder(List<Integer> order, TreeNode node) {
        if (node == null) return;
        inorder(order, node.left);
        order.add(node.val);
        inorder(order, node.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        inorder(inOrder, root);
        return inOrder;
    }
}
