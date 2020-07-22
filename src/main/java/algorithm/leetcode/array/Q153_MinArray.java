package algorithm.leetcode.array;

/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 请找出其中最小的元素,你可以假设数组中不存在重复元素。
 * <p>
 * 示例 1:
 * 输入: [3,4,5,1,2]
 * 输出: 1
 * <p>
 * 示例 2:
 * 输入: [4,5,6,7,0,1,2]
 * 输出: 0
 */
public class Q153_MinArray {
    public static int findMin(int[] nums) {
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                return nums[i];
            }
        }

        return min;
    }

    public static int findMin2(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length - 1;

        if (nums[left] < nums[right]) {
            return nums[0];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3, 4};
        System.out.println(findMin(nums));
        System.out.println(findMin2(nums));
    }
}
