package Easy;

public class Leetcode110 {
    public static void main(String[] args) {
        Leetcode110 obj = new Leetcode110();
        TreeNode root = new TreeNode(10, new TreeNode(20, new TreeNode(40, new TreeNode(80), new TreeNode(90)), new TreeNode(50)), new TreeNode(30, new TreeNode(60), new TreeNode(70)));
        System.out.println(obj.isBalanced(root));
    }

    private int getHeight(TreeNode node) {
        if (node == null) return 0;
        int a = getHeight(node.left);
        int b = getHeight(node.right);
        return Math.max(a, b)+1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        int diff = Math.abs(left-right);
        if (diff > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
