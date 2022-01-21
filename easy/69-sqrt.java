class Solution {
    // Some binary search practice..
    public int mySqrt(int x) {
        if (x < 1) return 0;
        int low = 1, high = x, res = 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid > x/mid) {
                high = mid;
            } else {
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
}