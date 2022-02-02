public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1) return nums[0];
        double maxAverage = Double.MIN_VALUE;

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        maxAverage = (double) windowSum / k;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxAverage = Math.max(maxAverage, (double) windowSum / k);
        }

        return maxAverage;
    }
}