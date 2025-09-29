package Easy;

import java.util.ArrayList;
import java.util.List;

public class Leetcode257 {
    public static void main(String[] args) {
        Leetcode257 obj = new Leetcode257();
        TreeNode tree = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(3, new TreeNode(2), new TreeNode(3))), new TreeNode(2, new TreeNode(3, new TreeNode(3), new TreeNode(2)), new TreeNode(4, new TreeNode(2), new TreeNode(1))));
        List<String> paths = obj.binaryTreePaths(tree);
        for (String path: paths)
            System.out.println(path);
    }

    private void paths(TreeNode node, List<String> addPaths, StringBuilder path) {
        int len = path.length();
        if (node.left == null && node.right == null) {
            path.append(node.val);
            addPaths.add(path.toString());
            path.setLength(len);
            return;
        }
        path.append(node.val).append("->");
        if (node.left != null) paths(node.left, addPaths, path);
        if (node.right != null) paths(node.right, addPaths, path);
        path.setLength(len);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return null;
        List<String> output = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        paths(root, output, path);
        return output;
    }
}
