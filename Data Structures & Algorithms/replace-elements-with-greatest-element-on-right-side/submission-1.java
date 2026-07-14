class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ret = new int[arr.length];
        int max = -1;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            temp = arr[arr.length - i - 1];

            ret[arr.length - i - 1] = max;
            if (temp > max) max = temp;
        }

        return ret;
    }
}