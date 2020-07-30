package algorithm.leetcode.array;

public class Q1051_HeightChecker {
    public static int heightChecker(int[] heights) {
        int left = 0;
        int right = heights.length;
        for (int i = 0; i < heights.length; i++) {

        }

        return right - left;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(height));
    }
}
