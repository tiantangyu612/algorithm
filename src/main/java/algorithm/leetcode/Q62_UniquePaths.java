package algorithm.leetcode;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 问总共有多少条不同的路径？
 */
public class Q62_UniquePaths {
    public int uniquePaths(int m, int n) {
        if (m < 1 || n < 1) {
            return 0;
        }

        if (m == 1) {
            return n;
        }

        if (n == 1) {
            return m;
        }

        return 0;
    }

    public static void main(String[] args) {
        Q62_UniquePaths uniquePaths = new Q62_UniquePaths();
        uniquePaths.uniquePaths(3, 2);
    }
}
