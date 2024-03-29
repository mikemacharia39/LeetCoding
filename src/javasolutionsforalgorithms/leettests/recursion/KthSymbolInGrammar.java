package javasolutionsforalgorithms.leettests.recursion;

/**
 * We build a table of n rows (1-indexed). We start by writing 0 in the 1st row.
 * Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01,
 * and each occurrence of 1 with 10.
 * <p>
 * For example, for n = 3, the 1st row is 0, the 2nd row is 01, and the 3rd row is 0110.
 * Given two integer n and k, return the kth (1-indexed) symbol in the nth row of a table of n rows.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 1, k = 1
 * Output: 0
 * Explanation: row 1: 0
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: n = 2, k = 1
 * Output: 0
 * Explanation:
 * row 1: 0
 * row 2: 01
 * <p>
 * <p>
 * Example 3:
 * <p>
 * Input: n = 2, k = 2
 * Output: 1
 * Explanation:
 * row 1: 0
 * row 2: 01
 */
public class KthSymbolInGrammar {

    /**
     * Uses recursion, just interesting
     *
     * @param n rows
     * @param k position
     * @return val
     */
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        int parent = kthGrammar(n - 1, (k + 1) / 2);
        if (k % 2 == 0) {
            return parent == 1 ? 0 : 1;
        } else {
            return parent;
        }
    }

    /**
     * TimeLimit Exceeded with rows 30 and 4382822 element
     *
     * @param n rows
     * @param k position
     * @return val
     */
    public int kthGrammar1(int n, int k) {
        // Now in every subsequent row, we look at the previous row and replace each
        // occurrence of 0 with 01, and each occurrence of 1 with 10.
        // n = 3, the 1st row is 0, the 2nd row is 01, and the 3rd row is 0110.
        // 1 -> 0
        // 2 -> 01
        // 3 -> 0110
        // 4 -> 01101001

        return Integer.parseInt(Character.toString(generateElements(n).charAt(k - 1)));
    }

    public String generateElements(int n) {
        String str = "0";

        for (int i = 0; i < n - 1; i++) {
            str = replaceStrings(str);
        }

        return str;
    }

    public String replaceStrings(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                sb.append("01");
            } else {
                sb.append("10");
            }
        }
        return sb.toString();
    }
}
