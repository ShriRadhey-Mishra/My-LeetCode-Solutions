package Medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode105 {
    HashMap<Integer, Integer> hm = new HashMap<>();
    public static void main(String[] args) {
        Leetcode105 obj = new Leetcode105();
        int[] preorder = new int[] {3,9,20,15,7};
        int[] inorder = new int[] {9,3,15,20,7};
        TreeNode tree = obj.buildTree(preorder, inorder);
        levelOrder(tree);
    }
    private TreeNode completeTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preEnd < preStart || inEnd < inStart)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int index = inStart;
        while (index <= inEnd && inorder[index] != root.val) {
            index++;
        }

        int leftSize = index - inStart;

        root.left = completeTree(preorder, preStart + 1, preStart + leftSize,
                inorder, inStart, index - 1);
        root.right = completeTree(preorder, preStart + leftSize + 1, preEnd,
                inorder, index + 1, inEnd);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) hm.put(inorder[i], i);
        return completeTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
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
}
