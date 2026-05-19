class Solution {
    public int search(int[] nums, int target) {
        int i = 0; int j = nums.length - 1;

        while (i + 1 < j) {
            int middle = (i + j + 1) / 2;
            int temp = nums[middle];
            if (temp == target) return middle;

            if (temp < target) i = middle;
            if (temp > target) j = middle;
        }

        return nums[i] == target ? i : nums[j] == target ? j : -1;
    }
}
