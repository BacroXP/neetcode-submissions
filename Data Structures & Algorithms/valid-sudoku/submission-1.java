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

                row.putIfAbsent(y, new HashSet<>());
                col.putIfAbsent(x, new HashSet<>());
                sqr.putIfAbsent(sqri, new HashSet<>());

                System.out.println("\n\n" + sqri + ":\n");
                System.out.println(row.get(y));
                System.out.println(col.get(x));
                System.out.println(sqr.get(sqri));

                if (row.computeIfAbsent(y, k -> new HashSet<>()).contains(c) ||
                    col.computeIfAbsent(x, k -> new HashSet<>()).contains(c) ||
                    sqr.computeIfAbsent(sqri, k -> new HashSet<>()).contains(c)) {
                        return false;
                }

                row.get(y).add(c);
                col.get(x).add(c);
                sqr.get(sqri).add(c);
            }
        }

        return true;
    }
}
