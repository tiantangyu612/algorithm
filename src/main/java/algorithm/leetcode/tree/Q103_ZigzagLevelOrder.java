package algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的锯齿形层次遍历
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回锯齿形层次遍历如下：
 * [
 * [3],
 * [20,9],
 * [15,7]
 * ]
 */
public class Q103_ZigzagLevelOrder {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == root) {
            return result;
        }

        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(root);
        boolean reverse = true;
        while (!treeNodes.isEmpty()) {
            int size = treeNodes.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = treeNodes.remove(0);
                list.add(treeNode.val);

                if (!reverse) {
                    if (null != treeNode.left) {
                        treeNodes.add(treeNode.left);
                    }

                    if (null != treeNode.right) {
                        treeNodes.add(treeNode.right);
                    }
                } else {
                    if (null != treeNode.right) {
                        treeNodes.add(treeNode.right);
                    }

                    if (null != treeNode.left) {
                        treeNodes.add(treeNode.left);
                    }
                }
            }

            reverse = !reverse;
            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {
        Q103_ZigzagLevelOrder zigzagLevelOrder = new Q103_ZigzagLevelOrder();
        List<List<Integer>> result = zigzagLevelOrder.zigzagLevelOrder(TreeNode.newInstance());
        System.out.println(result);
    }
}
