package javasolutionsforalgorithms.revision_v2.leetcode.math;

/**
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 *
 * Example 1:
 *
 * Input: num = 38
 * Output: 2
 * Explanation: The process is
 * 38 --> 3 + 8 --> 11
 * 11 --> 1 + 1 --> 2
 * Since 2 has only one digit, return it.
 *
 * Example 2:
 *
 * Input: num = 0
 * Output: 0
 */
public class AddDigits {

    /**
     * Easy to understand
     */
    public int addDigits1(int num) {

        if (num < 10) {
            return num;
        }

        while (num > 9) {
            num = addHelper(num);
        }

        return num;
    }

    /**
     * Time complexity: O(n)
     * @param num
     * @return
     */
    public int addHelper(int num) {

        int sum = 0;

        while (num > 0) {
            int mod = num % 10;
            num = num / 10;

            sum = sum + mod;
        }

        return sum;
    }
}
