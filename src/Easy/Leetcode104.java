package Easy;

public class Leetcode104 {
    public static void main(String[] args) {
        Leetcode104 obj = new Leetcode104();
        TreeNode root = new TreeNode(10, new TreeNode(20, new TreeNode(40, new TreeNode(80), new TreeNode(90)), new TreeNode(50)), new TreeNode(30, new TreeNode(60), new TreeNode(70)));
        System.out.println(obj.maxDepth(root));
    }
    private int depth(TreeNode node, int curr) {
        if (node == null) return curr;
        int a = depth(node.left, curr+1);
        int b = depth(node.right, curr+1);
        return Math.max(a, b);
    }
    public int maxDepth(TreeNode root) {
        return depth(root, 0);
    }
}
