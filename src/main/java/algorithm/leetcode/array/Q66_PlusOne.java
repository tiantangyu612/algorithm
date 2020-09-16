package algorithm.leetcode.array;

import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class Q66_PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;
            if (digits[i] % 10 != 0) {
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        Q66_PlusOne plusOne = new Q66_PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{9, 9, 9})));
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{1, 0, 9})));
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{1, 9, 9})));
    }
}
