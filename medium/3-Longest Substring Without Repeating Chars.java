class Solution {
    // First approach - Brute Force
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            String substr = s.substring(i);
            if (result >= substr.length()) return result;

            HashSet<Character> uniqueLetters = new HashSet<Character>();
            for (int j = 0; j < substr.length(); j++) {
                if (!uniqueLetters.add(substr.charAt(j))) {
                    break;
                }
            }

            if (uniqueLetters.size() > result) {
                result = uniqueLetters.size();
            }
        }
        return result;
    }
}