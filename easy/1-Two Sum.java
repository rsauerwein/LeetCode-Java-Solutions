class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(target - nums[i])) {
                int[] result = {numbers.get(target - nums[i]), i};
                return result;
            } else {
                numbers.put(nums[i], i);
            }
        }
        return null;
    }
}