class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,Set<Character>> row = new HashMap<>();
        HashMap<Integer,Set<Character>> col = new HashMap<>();
        HashMap<Integer,Set<Character>> sqr = new HashMap<>();

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                int sqri = (y / 3) + (x / 3) * 3;
                Character c = board[y][x];

                if (c == '.') continue;

            boolean inRow = !row.computeIfAbsent(y, k -> new HashSet<>()).add(c);
            boolean inCol = !col.computeIfAbsent(x, k -> new HashSet<>()).add(c);
            boolean inSqr = !sqr.computeIfAbsent(sqri, k -> new HashSet<>()).add(c);

            if (inRow || inCol || inSqr) return false;
            }
        }

        return true;
    }
}
