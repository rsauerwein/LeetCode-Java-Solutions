class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length == 1) return strs[0];
        int i = 0;
        while (i < 999) {
            int j = 0;
            char prev = ' ';

            for (String s :
                    strs) {
                if(i >= s.length()) return result;
                if(j == 0) {
                    prev = s.charAt(i);
                } else {
                    if(s.charAt(i) != prev) {
                        return result;
                    }
                }
                j++;
            }
            result += prev;
            i++;
        }
        return result;
    }
}