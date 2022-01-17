class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        char[] patternArray = pattern.toCharArray();

        if(words.length != patternArray.length) return false;

        HashMap<Character, String> mappings = new HashMap<Character, String>();
        for (int i = 0; i < words.length; i++) {
            if (mappings.containsKey(patternArray[i])) {
                if (!mappings.get(patternArray[i]).equals(words[i])) return false;
            } else {
                if (mappings.containsValue(words[i])) return false;
                mappings.put(patternArray[i], words[i]);
            }
        }

        return true;
    }
}