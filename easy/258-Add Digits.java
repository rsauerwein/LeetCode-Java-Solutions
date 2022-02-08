class Solution {
    // Runtime: 1 ms, faster than 98.89% of Java online submissions for Add Digits.
    // Memory Usage: 39.3 MB, less than 18.71% of Java online submissions for Add Digits.
    public int addDigits(int num) {
        if (num < 10) return num;
        int result = num % 9;
        return result == 0 ? 9 : result;
    }
}