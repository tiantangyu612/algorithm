package algorithm.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 */
public class Q347_TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int num : nums) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((m, n) -> m[1] - n[1]);

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (queue.size() == k) {
                if (queue.peek()[1] < count) {
                    queue.poll();
                    queue.add(new int[]{num, count});
                }
            } else {
                queue.add(new int[]{num, count});
            }
        }

        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = queue.poll()[0];
        }

        return ret;
    }

    public static void main(String[] args) {
        Q347_TopKFrequent topKFrequent = new Q347_TopKFrequent();
        System.out.println(Arrays.toString(topKFrequent.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
