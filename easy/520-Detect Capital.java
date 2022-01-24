public class Solution {
    private boolean checkLowerCase(char[] chars) {
        for (int i = 1; i < chars.length; i++) {
            if (!Character.isLowerCase(chars[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean checkUpperCase(char[] chars) {
        for (int i = 1; i < chars.length; i++) {
            if (!Character.isUpperCase(chars[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        boolean res = false;
        if (Character.isUpperCase(chars[0])) {
            return checkLowerCase(chars) || checkUpperCase(chars);
        } else {
            return checkLowerCase(chars);
        }
    }
}