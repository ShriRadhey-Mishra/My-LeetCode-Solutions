package Medium;

public class Leetcode98 {
    public static void main(String[] args) {
        Leetcode98 obj = new Leetcode98();
        TreeNode tree = new TreeNode(5,
                new TreeNode(1),
                new TreeNode(4,
                        new TreeNode(3),
                        new TreeNode(6)));
        System.out.println(obj.isValidBST(tree));
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode node, long min, long max) {
        if (node == null)
            return true;
        if (node.val <= min || node.val >= max)
            return false;
        return helper(node.left, min, node.val) && helper(node.right, node.val, max);
    }
}
