package javasolutionsforalgorithms.revision_v2.leetcode.subarray;

/**
 * <a href="https://leetcode.com/problems/maximum-average-subarray-i/">...</a>
 *
 * You are given an integer array nums consisting of n elements, and an integer k.
 *
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
 * Any answer with a calculation error less than 10^5 will be accepted.
 *
 * Example 1:
 *
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 */
public class MaximumAverageSubArray1 {

    /**
     * Time complexity: O(n)
     * @param nums
     * @param k
     * @return
     */
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int left = 0;
        double average = -100000;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            if (right - left + 1 == k) { // if the window size is equal to k then calculate the average. We are doing left + 1 because we are starting from 0
                average = Math.max(average, (double) sum/k);

                sum -= nums[left];
                left++;
            }
        }
        return average;
    }

    public double findMaxAverage_good(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) { // add all values until length k
            sum += nums[i];
        }

        int maxSum = sum;

        for (int j = k; j < nums.length; j++) {
            sum += nums[j] - nums[j - k]; // subtract the right and left values
            maxSum = Math.max(maxSum, sum); // get the largest sum
        }

        return (double) maxSum/k;
    }

    public double findMaxAverage1(int[] nums, int k) {
        double max = -100000;
        for (int i = 0; i < nums.length-k + 1; i++) {
            double sum = 0;
            for (int j = i; j < i + k; j++) {
                if (j < nums.length) {
                    sum += nums[j];
                }
            }
            double division = sum / k;
            max = Math.max(division, max);
        }
        return max;
    }
}
