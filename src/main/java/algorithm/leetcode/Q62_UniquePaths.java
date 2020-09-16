package algorithm.leetcode;

import java.util.Arrays;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 问总共有多少条不同的路径？
 */
public class Q62_UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }

    public int uniquePaths2(int m, int n) {
        int[] arr = new int[n];
        Arrays.fill(arr, 1);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[j] += arr[j - 1];
            }
        }

        return arr[n - 1];
    }

    public static void main(String[] args) {
        Q62_UniquePaths uniquePaths = new Q62_UniquePaths();
        int n = uniquePaths.uniquePaths(4, 3);
        System.out.println(n);
        n = uniquePaths.uniquePaths2(4, 3);
        System.out.println(n);

//        1 1 1
    }
}
