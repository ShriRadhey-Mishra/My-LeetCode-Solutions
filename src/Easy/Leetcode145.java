package Easy;

import java.util.ArrayList;
import java.util.List;

public class Leetcode145 {
    public static void main(String[] args) {
        Leetcode145 obj = new Leetcode145();
        TreeNode root = new TreeNode(10, new TreeNode(20, new TreeNode(40, new TreeNode(80), new TreeNode(90)), new TreeNode(50)), new TreeNode(30, new TreeNode(60), new TreeNode(70)));
        System.out.println(obj.postorderTraversal(root));
    }

    private void postorder(List<Integer> order, TreeNode node) {
        if (node == null) return;
        postorder(order, node.left);
        postorder(order, node.right);
        order.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        postorder(postOrder, root);
        return postOrder;
    }
}
