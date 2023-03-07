import java.io.*;
import java.util.*;

public class GFG_Find_The_Number_Of_Islands {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {


        }
        pw.close();
    }

    class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first = first;
            this.second = second;
        }
    }
    public  int numIsLands(char grid[][]){
        int n = grid.length;
        int m = grid[0].length;

        int vis[][] = new int[n][m];

        int cnt = 0;
        for(int row = 0;row<n;row++){
            for (int col = 0;col<m;col++){
                if(vis[row][col]==0 && grid[row][col]=='1'){
                    cnt++;
                    bfs(row,col,vis,grid);
                }
            }
        }

        return cnt;
    }

    public   void bfs(int ro,int co,int [][]vis,char[][]grid){
        vis[ro][co] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(ro,co));
        int n = grid.length;
        int m = grid[0].length;

        while (!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            for(int delrow = -1;delrow<=1;delrow++){
                for (int delcol = -1;delcol<=1;delcol++){
                    int nrow = row+delrow;
                    int ncol = col+delcol;

                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<n &&  grid[nrow][ncol]=='1' && vis
                    [nrow][ncol]==0){
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
