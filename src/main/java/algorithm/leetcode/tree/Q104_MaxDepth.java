package algorithm.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class Q104_MaxDepth {
    public int maxDepth2(TreeNode root) {
        if (null == root) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int maxDepth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();

                if (null != temp.left) {
                    queue.add(temp.left);
                }

                if (null != temp.right) {
                    queue.add(temp.right);
                }
            }

            maxDepth++;
        }

        return maxDepth;
    }

    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Q104_MaxDepth maxDepth = new Q104_MaxDepth();
        System.out.println(maxDepth.maxDepth(TreeNode.newInstance()));
        System.out.println(maxDepth.maxDepth2(TreeNode.newInstance()));
    }
}
