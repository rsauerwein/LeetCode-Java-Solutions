class Solution {
    public int maximumWealth(int[][] accounts) {
        int richestCustomer = 0;
        for (int[] account : accounts) {
            int total = 0;
            for (int balance : account) {
                total += balance;
            }
            if (total > richestCustomer) richestCustomer = total;
        }
        return richestCustomer;
    }
}