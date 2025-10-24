package Easy;

public class Leetcode543 {
    private int diameter = 0;

    public static void main(String[] args) {
        Leetcode543 obj = new Leetcode543();
        TreeNode tree = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3));
        System.out.println(obj.diameterOfBinaryTree(tree));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        diameter = Math.max(diameter, left + right);
        return Math.max(left, right) + 1;
    }
}
