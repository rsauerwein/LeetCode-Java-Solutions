public class Solution {
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