package Medium;

public class Leetcode236 {
    public static void main(String[] args) {
        Leetcode236 obj = new Leetcode236();
        TreeNode tree = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2,
                                new TreeNode(7),
                                new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(0),
                        new TreeNode(8)));
        TreeNode first = tree.left;
        TreeNode second = tree.left.right.right;
        System.out.println(obj.lowestCommonAncestor(tree, first, second).val);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null) return right;
        else if (right == null) return left;
        else return root;
    }
}
