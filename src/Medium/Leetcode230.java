package Medium;

public class Leetcode230 {
    public static void main(String[] args) {
        Leetcode230 obj = new Leetcode230();
        TreeNode tree = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2,
                                new TreeNode(1),
                                null),
                        new TreeNode(4)),
                new TreeNode(6));
        int k = 3;
        System.out.println(obj.kthSmallest(tree, k));
    }
    private int size(TreeNode node) {
        if (node == null) return 0;
        return 1 + size(node.left) + size(node.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        int leftSize = size(root.left);
        if (k == leftSize +1) return root.val;
        else if (k <= leftSize) return kthSmallest(root.left, k);
        else return kthSmallest(root.right, k - leftSize - 1);
    }
}
