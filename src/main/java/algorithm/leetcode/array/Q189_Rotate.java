package algorithm.leetcode.array;

import java.util.Arrays;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class Q189_Rotate {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;


    }

    public static void main(String[] args) {
        Q189_Rotate rotate = new Q189_Rotate();

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
