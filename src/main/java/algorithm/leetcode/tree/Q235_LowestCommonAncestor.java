package algorithm.leetcode.tree;

/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先
 */
public class Q235_LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode result = root;
        while (true) {
            if (p.val < result.val && q.val < result.val) {
                result = result.left;
            } else if (p.val > result.val && q.val > result.val) {
                result = result.right;
            } else {
                break;
            }
        }

        return result;
    }
}
