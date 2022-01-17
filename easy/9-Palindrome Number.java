class Solution {
    public boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        int len = y.length();
        for (int i = 0; i < (int) Math.round(y.length() / 2.0); i++) {
            if(y.charAt(i) != y.charAt(len - i - 1)) { return false; }
        }

        return true;
    }
}