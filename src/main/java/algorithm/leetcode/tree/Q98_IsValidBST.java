package algorithm.leetcode.tree;

import java.util.Stack;

public class Q98_IsValidBST {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double inorder = -Double.MAX_VALUE;

        while (!stack.isEmpty() || null != root) {
            while (null != root) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if (root.val <= inorder) {
                return false;
            }

            inorder = root.val;
            root = root.right;
        }

        return true;
    }
}
