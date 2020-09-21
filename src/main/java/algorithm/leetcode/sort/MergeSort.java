package algorithm.leetcode.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    private List<Integer> merge(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>(l1.size() + l2.size());
        int start1 = 0;
        int start2 = 0;
        int start1End = l1.size();
        int start2End = l2.size();

        while (start1 < start1End && start2 < start2End) {
            Integer num1 = l1.get(start1);
            Integer num2 = l2.get(start2);

            if (num1 < num2) {
                result.add(num1);
                start1++;
            } else {
                result.add(num2);
                start2++;
            }
        }

        while (start1 < start1End) {
            result.add(l1.get(start1++));
        }

        while (start2 < start2End) {
            result.add(l2.get(start2++));
        }

        return result;
    }
}
