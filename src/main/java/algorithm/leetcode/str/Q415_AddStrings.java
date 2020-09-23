package algorithm.leetcode.str;

/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和
 * 提示：
 * <p>
 * num1 和num2 的长度都小于 5100
 * num1 和num2 都只包含数字 0-9
 * num1 和num2 都不包含任何前导零
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式
 */
public class Q415_AddStrings {

    public String addStrings(String num1, String num2) {
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        int upper = 0;
        StringBuilder result = new StringBuilder();

        while (index1 >= 0 || index2 >= 0 || upper != 0) {
            int x = index1 >= 0 ? num1.charAt(index1) - '0' : 0;
            int y = index2 >= 0 ? num2.charAt(index2) - '0' : 0;
            int temp = x + y + upper;
            result.append(temp % 10);
            upper = temp / 10;
            index1--;
            index2--;
        }

        result.reverse();
        return result.toString();
    }

    public static void main(String[] args) {
        Q415_AddStrings addStrings = new Q415_AddStrings();
        String result = addStrings.addStrings("99402735892322", "2348972348923234");
        System.out.println(result);
        System.out.println(99402735892322L + 2348972348923234L);
    }
}
