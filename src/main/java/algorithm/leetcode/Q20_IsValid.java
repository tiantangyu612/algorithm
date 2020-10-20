package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class Q20_IsValid {
    public boolean isValid(String s) {
        if (null == s || s.isEmpty()) {
            return true;
        }

        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mapping.containsKey(c)) {
                char topChar = stack.isEmpty() ? ' ' : stack.pop();
                if (topChar != mapping.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Q20_IsValid isValid = new Q20_IsValid();
        System.out.println(isValid.isValid("((()))"));
        System.out.println(isValid.isValid("({[]})"));
        System.out.println(isValid.isValid("({[)})"));
    }
}
