package algorithm.leetcode.dp;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 */
public class Q70_ClimbStairs {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int climbStairs2(int n) {
        int p = 0;
        int q = 0;
        int r = 1;

        for (int i = 0; i < n; i++) {
            p = q;
            q = r;
            r = p + q;
        }

        return r;
    }

    public static void main(String[] args) {
        Q70_ClimbStairs climbStairs = new Q70_ClimbStairs();
        System.out.println(climbStairs.climbStairs(7));
        System.out.println(climbStairs.climbStairs2(7));
    }
}
