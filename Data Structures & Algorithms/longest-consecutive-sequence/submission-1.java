class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> inp = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int max = 0, i = 0;

        for (int num: nums) {
            if (!inp.contains(num - 1)) {
                while (inp.contains(num)) {
                    num++;
                    i++;
                }

                if (max < i) max = i;
                i = 0;
            }
        }

        return max;
    }
}
