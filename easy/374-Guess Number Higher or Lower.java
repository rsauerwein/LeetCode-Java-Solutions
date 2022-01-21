public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1, r = n;

        while (l < r) {
            int mid = l + (r - l) / 2;
            int result = guess(mid);
            if (result == -1) {
                r = mid -1;
            } else if (result == 1) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return l;
    }
}