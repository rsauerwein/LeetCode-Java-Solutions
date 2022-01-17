class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mappings = new HashMap<Character, Integer>();
        mappings.put('I', 1);
        mappings.put('V', 5);
        mappings.put('X', 10);
        mappings.put('L', 50);
        mappings.put('C', 100);
        mappings.put('D', 500);
        mappings.put('M', 1000);

        int result = 0;
        int i = s.length();
        while (i > 0) {
            if(i > 1) {
                int no1 = mappings.get(s.charAt(i - 2));
                int no2 = mappings.get(s.charAt(i - 1));

                if(no1 < no2) {
                    result += no2 - no1;
                    i-=2;
                } else {
                    result += no2;
                    i--;
                }
            } else {
                result += mappings.get(s.charAt(i - 1));
                i--;
            }
        }

        return result;
    }
}