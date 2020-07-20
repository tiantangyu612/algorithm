package algorithm.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个已按照升序排列的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 说明:
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * <p>
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 */
public class Q167_TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if (cache.get(diff) != null) {
                return new int[]{cache.get(diff) + 1, i + 1};
            } else {
                cache.put(numbers[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}
