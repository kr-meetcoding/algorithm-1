package oeyh.chap12;

public class number_of_islands {
    class Solution {
        public static int numIslands(char[][] grid) {
            int cnt = 0;

            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[0].length; j++){
                    if((grid[i][j] == '1')){
                        dfs(grid, i, j);
                        cnt++;
                    }
                }
            }
            return cnt;
        }

        static void dfs(char[][] grid, int i, int j){
            if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
                return;
            }

            grid[i][j] = '0';

            dfs(grid, i+1, j);
            dfs(grid, i-1, j);
            dfs(grid, i, j+1);
            dfs(grid, i, j-1);
        }
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        if(1 == Solution.numIslands(grid)) System.out.println("correct");
    }
}
