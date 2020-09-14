package algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * 输出: [1,3,2]
 */
public class Q94_InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode treeNode, List<Integer> res) {
        if (treeNode != null) {
            if (treeNode.left != null) {
                helper(treeNode.left, res);
            }
            res.add(treeNode.val);
            if (treeNode.right != null) {
                helper(treeNode.right, res);
            }
        }
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode curr = root;
        TreeNode pre;

        while (curr != null) {
            if (curr.left == null) {
                res.add(curr.val);
                curr = curr.right;
            } else {
                pre = curr.left;
                while (pre.right != null) {
                    pre = pre.right;
                }

                pre.right = curr;
                TreeNode temp = curr;
                curr = curr.left;
                temp.left = null;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Q94_InorderTraversal inorderTraversal = new Q94_InorderTraversal();
        List<Integer> integers = inorderTraversal.inorderTraversal(TreeNode.newInstance());
        System.out.println(integers);

        integers = inorderTraversal.inorderTraversal2(TreeNode.newInstance());
        System.out.println(integers);
    }
}
