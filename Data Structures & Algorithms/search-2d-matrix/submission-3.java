class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = -1;

        for (int[] row: matrix) {
            if (row[0] > target) break;

            i++;
        }

        if (i < 0) return false;
        int[] row = matrix[i];

        for (int el: row) {
            if (el == target) return true;
        }

        return false;
    }
}
