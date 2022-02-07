public class Solution {
	// Runtime: 1 ms, faster than 99.79% of Java online submissions for Find the Difference.
	// Memory Usage: 42.6 MB, less than 6.09% of Java online submissions for Find the Difference.
    public char findTheDifference(String s, String t) {
        int[] letters = new int[26];

        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0) {
                return (char) (i + 'a');
            }
        }

        return ' ';
    }
}