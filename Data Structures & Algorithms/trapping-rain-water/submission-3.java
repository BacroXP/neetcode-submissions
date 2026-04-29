class Solution {
    public int trap(int[] height) {
        int i = 0; int j = height.length - 1;
        int h1 = 0; int h2 = 0;

        int sol = 0;

        while (i != j) {
            if (h1 < height[i]) h1 = height[i];
            else sol += h1 - height[i];

            if (h2 < height[j]) h2 = height[j];
            else sol += h2 - height[j];

            if (height[i] < height[j]) i++;
            else j--;
        }

        return sol;
    }
}
