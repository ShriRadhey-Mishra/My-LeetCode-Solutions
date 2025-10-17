package Medium;

public class Leetcode235 {
    public static void main(String[] args) {
        Leetcode235 obj = new Leetcode235();
        TreeNode tree = new TreeNode(6,
                new TreeNode(2,
                        new TreeNode(0),
                        new TreeNode(4,
                                new TreeNode(3),
                                new TreeNode(5))),
                new TreeNode(8,
                        new TreeNode(7),
                        new TreeNode(9)));
        TreeNode p = tree.left.right.left, q = tree.left.right.right;
        System.out.println(obj.lowestCommonAncestor(tree,p, q).val);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return root;
        if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        return root;
    }
}
