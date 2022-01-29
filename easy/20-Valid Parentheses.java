public class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;

        Map<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put(']', '[');
        mappings.put('}', '{');

        Stack<Character> prev = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                prev.push(c);
            } else {
                if (prev.isEmpty()) return false;
                char curr = prev.pop();
                if (mappings.get(c) != curr) return false;
            }
        }
        return prev.isEmpty();
    }
}