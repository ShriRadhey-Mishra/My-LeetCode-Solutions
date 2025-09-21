package Easy;

import java.util.ArrayList;
import java.util.List;

public class Leetcode144 {
    public static void main(String[] args) {
        Leetcode144 obj = new Leetcode144();
        TreeNode root = new TreeNode(10, new TreeNode(20, new TreeNode(40, new TreeNode(80), new TreeNode(90)), new TreeNode(50)), new TreeNode(30, new TreeNode(60), new TreeNode(70)));
        System.out.println(obj.preorderTraversal(root));
    }

    private void preorder(List<Integer> order, TreeNode node) {
        if (node == null) return;
        order.add(node.val);
        preorder(order, node.left);
        preorder(order, node.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<>();
        preorder(preOrder, root);
        return preOrder;
    }
}
