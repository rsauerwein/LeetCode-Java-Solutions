class Solution {
    public int reverse(int x) {
        int overflowThreshold = Integer.MAX_VALUE / 10;
        int result = 0;
        while (x != 0) {
            if (Math.abs(result) > overflowThreshold) return 0;
            result = result * 10 + x % 10;
            x /=10;
        }
        return result;
    }
}