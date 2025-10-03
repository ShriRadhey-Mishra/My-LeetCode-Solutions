package Medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode106 {
    public HashMap<Integer, Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        Leetcode106 obj = new Leetcode106();
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        int[] postorder = new int[]{9, 15, 7, 20, 3};
        TreeNode tree = obj.buildTree(inorder, postorder);
        levelOrder(tree);
    }

    public static void levelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            System.out.print(temp.val + " ");
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }

        System.out.println();
    }

    private TreeNode completeTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int index = hm.get(root.val);
        int leftSize = index - inStart;
        root.left = completeTree(inorder, inStart, index - 1, postorder, postStart, postStart + leftSize - 1);
        root.right = completeTree(inorder, index + 1, inEnd, postorder, postStart+ leftSize, postEnd - 1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            hm.put(inorder[i], i);
        }
        return completeTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
}
