package Easy;

public class Leetcode938 {
    public static void main(String[] args) {
        Leetcode938 obj = new Leetcode938();
        TreeNode tree = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3),
                        new TreeNode(7)),
                new TreeNode(15,
                        null,
                        new TreeNode(18)));
        int low = 7;
        int high = 15;
        System.out.println(obj.rangeSumBST(tree, low, high));
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        if(root.val > high) return rangeSumBST(root.left, low, high);
        if(root.val < low) return rangeSumBST(root.right, low, high);
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
