public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 1) return false;

        Set<Integer> records = new HashSet<>();

        int r = 0;
        while (r <= k && r < nums.length) {
            if (records.contains(nums[r])) {
                return true;
            } else {
                records.add(nums[r]);
            }
            r++;
        }

        int l = 0;
        while (r < nums.length) {
            records.remove(nums[l]);

            if (records.contains(nums[r])) {
                return true;
            } else {
                records.add(nums[r]);
            }

            l++;
            r++;
        }

        return false;
    }
}