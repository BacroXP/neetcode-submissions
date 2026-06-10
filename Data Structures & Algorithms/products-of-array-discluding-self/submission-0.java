public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = 1;

            for (int j = 0; j < ret.length; j++) {
                if (i != j) ret[i] *= nums[j];
            }
        }

        return ret;
    }
}