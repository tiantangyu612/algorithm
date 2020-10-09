package algorithm.leetcode.array;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class Q283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[cur];
                nums[cur] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        Q283_MoveZeroes moveZeroes = new Q283_MoveZeroes();
        int[] array = new int[]{0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }
}
