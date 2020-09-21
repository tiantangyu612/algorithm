package algorithm.leetcode.array;

import java.util.Arrays;

/**
 * 给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数
 */
public class Q41_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] < n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < n; ++i) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }


        return n + 1;
    }

    public static void main(String[] args) {
        Q41_FirstMissingPositive firstMissingPositive = new Q41_FirstMissingPositive();
        int result = firstMissingPositive.firstMissingPositive(new int[]{-1, 5, 3, 4, 6, 2});
        System.out.println(result);
    }
}
