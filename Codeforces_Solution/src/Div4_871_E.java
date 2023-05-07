import java.util.Scanner;

public class Div4_871_E {

    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};;
    public static long largestLakeVolume(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        long maxVolume = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 0 && grid[i][j] > 0) {
                    int[] volume = new int[1];
                    dfs(grid, visited, i, j, volume);
                    maxVolume = Math.max(maxVolume, volume[0]);
                }
            }
        }

        return maxVolume;
    }

    public static void dfs(int[][] grid, int[][] visited, int x, int y, int[] volume) {
        visited[x][y] = -1;
        volume[0] += grid[x][y];


        for (int[] dir : directions) {
            int nx = x + dir[0];
            int ny = y + dir[1];
            if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length && visited[nx][ny] == 0 && grid[nx][ny] > 0) {
                dfs(grid, visited, nx, ny, volume);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();

        for(int t =1;t<=test;t++) {
            int n = in.nextInt(), m = in.nextInt();
            int grid[][] = new int[n][m];

            for(int i = 0;i<n;i++){
                for (int j = 0;j<m;j++){
                    grid[i][j] = in.nextInt();
                }
            }
            long maxVolume = largestLakeVolume(grid);
            System.out.println(maxVolume);
        }
    }
}
