package algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 */
public class Q102_LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (null == root) {
            return lists;
        }

        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode remove = nodes.remove(0);
                list.add(remove.val);
                if (remove.left != null) {
                    nodes.add(remove.left);
                }

                if (remove.right != null) {
                    nodes.add(remove.right);
                }
            }

            lists.add(list);
        }

        return lists;
    }

    public static void main(String[] args) {
        System.out.println(new Q102_LevelOrder().levelOrder(TreeNode.newInstance()));
    }
}
