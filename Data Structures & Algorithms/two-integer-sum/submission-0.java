class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = 0;

        for (int num: nums) {
            if (hm.containsKey(num)) return new int[]{hm.get(num), i};
            hm.put(target - num, i++);
        }
        return new int[]{};
    }
}
