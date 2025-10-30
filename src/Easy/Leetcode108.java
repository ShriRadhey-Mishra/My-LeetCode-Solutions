package Easy;

public class Leetcode108 {
    public static void main(String[] args) {
        Leetcode108 obj = new Leetcode108();
        int[] arr = {-10, -3, 0, 5, 9};
        TreeNode bst = obj.sortedArrayToBST(arr);
        System.out.println(bst.toString());
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildTree(nums, left, mid - 1);
        root.right = buildTree(nums, mid + 1, right);

        return root;
    }
}
