package algorithm.leetcode.dp;

/**
 * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积
 */
public class Q152_MaxProduct {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tempMax = max;
            int tempMin = min;
            max = Math.max(tempMax * nums[i], Math.max(nums[i], tempMin * nums[i]));
            min = Math.min(tempMin * nums[i], Math.min(nums[i], tempMax * nums[i]));
            ans = Math.max(max, ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        Q152_MaxProduct maxProduct = new Q152_MaxProduct();
        System.out.println(maxProduct.maxProduct(new int[]{2, 3, -2, 4, 6}));
        System.out.println(maxProduct.maxProduct(new int[]{-2, 0, -1}));
    }
}
