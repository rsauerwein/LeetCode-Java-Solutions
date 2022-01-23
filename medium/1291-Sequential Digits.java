class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        int start = 12;
        int startIncrement = 3;
        int i = 12;
        int solutions = 8;
        int increment = 11;
        while (i <= high) {
            i = start;
            for (int j = 0; j < solutions; j++) {
                if (i >= low && i <= high) {
                    ans.add(i);
                }
                i += increment;
            }
            solutions--;
            increment = increment * 10 + 1;
            start = start * 10 + startIncrement;
            startIncrement++;
        }

        return ans;
    }
}