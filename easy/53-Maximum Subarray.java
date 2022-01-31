class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int res = Integer.MIN_VALUE;
        int curr = 0;
        for (int num : nums) {
            curr += num;
            res = Math.max(curr, res);
            if (curr < 0) curr = 0;
        }
        return res;
    }
}