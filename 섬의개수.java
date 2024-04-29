public class 섬의개수 {
    class Solution {

        /**
         * j=0  j=1 j=2 j=3 j=4
         * i=0 ["1","1","1","1","0"],
         * i=1 ["1","1","0","1","0"],
         * i=2 ["1","1","0","0","0"],
         * i=3 ["0","0","0","0","0"]
         */

        public static int numIslands(char[][] grid) {
            int res = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        dfs(i, j, grid);
                        res++;
                    }
                }
            }
            return res;
        }

        private static void dfs(int i, int j, char[][] grid) {
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) { // validation
                return;
            }

            if (grid[i][j] == '0') {
                return;
            }

            // 물로변경처리
            grid[i][j] = '0';

            dfs(i - 1, j, grid); // 요것도 해야됨..
            dfs(i, j - 1, grid); // 요것도 해야됨..
            dfs(i + 1, j, grid);
            dfs(i, j + 1, grid);
        }
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};

        System.out.println(Solution.numIslands(grid));
    }
}
