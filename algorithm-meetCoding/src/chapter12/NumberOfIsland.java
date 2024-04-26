package chapter12;

public class NumberOfIsland {
    static char[][] map;
    static boolean[][] visited;
    static int[] dirY = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dirX = {0, 1, 1, 1, 0, -1, -1, -1};

    static void dfs(int y, int x) {
        visited[y][x] = true;
        for (int i = 0; i < 8; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if (isValid(newY, newX) && map[newY][newX] == '1' && !visited[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }

    static boolean isValid(int y, int x) {
        return y >= 0 && y < map.length && x >= 0 && x < map[0].length;
    }

    static int countIslands(char[][] map) {
        visited = new boolean[map.length][map[0].length];
        int answer = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == '1' && !visited[i][j]) {
                    dfs(i, j);
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        map = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '1'}
        };
        int answer = countIslands(map);
        System.out.println(answer);
    }
}
