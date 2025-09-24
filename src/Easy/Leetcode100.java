package Easy;

public class Leetcode100 {
    public static void main(String[] args) {
        Leetcode100 obj = new Leetcode100();
        TreeNode p = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        TreeNode q = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        System.out.println(obj.isSameTree(p, q));
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
