package Easy;

public class Leetcode101 {
    public static void main(String[] args) {
        Leetcode101 obj = new Leetcode101();
        TreeNode tree = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(3, new TreeNode(2), new TreeNode(3))), new TreeNode(2, new TreeNode(3, new TreeNode(3), new TreeNode(2)), new TreeNode(4, new TreeNode(2), new TreeNode(1))));
        System.out.println(obj.isSymmetric(tree));
    }
    private boolean isMirrorImage(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return (left.val == right.val) && isMirrorImage(left.left, right.right) && isMirrorImage(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirrorImage(root.left, root.right);
    }
}
