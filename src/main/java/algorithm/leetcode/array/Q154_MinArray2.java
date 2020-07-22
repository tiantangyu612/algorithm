package algorithm.leetcode.array;

/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 请找出其中最小的元素。注意数组中可能存在重复的元素。
 * <p>
 * 示例 1：
 * 输入: [1,3,5]
 * 输出: 1
 * <p>
 * 示例 2：
 * 输入: [2,2,2,0,1]
 * 输出: 0
 */
public class Q154_MinArray2 {
    public static int findMin(int[] nums) {
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
            if (nums[mid] == nums[right]) {
                right = right - 1;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 1, 3};
        System.out.println(findMin(nums));

        int[] nums2 = new int[]{10, 1, 10, 10, 10};
        System.out.println(findMin(nums2));
    }
}
