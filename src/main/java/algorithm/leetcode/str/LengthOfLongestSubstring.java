package algorithm.leetcode.str;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 */
public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (null == s || s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int back = 0;
        int front = 0;
        int max = 0;
        Set<Character> chars = new HashSet<>();

        while (front < s.length()) {
            char currentChar = s.charAt(front);
            if (!chars.contains(currentChar)) {
                chars.add(currentChar);
                int tempMax = front - back + 1;
                max = Math.max(max, tempMax);
            } else {
                char backChar = s.charAt(back);
                while (backChar != currentChar) {
                    chars.remove(backChar);
                    back++;
                    backChar = s.charAt(back);
                }

                back++;
            }

            front++;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
