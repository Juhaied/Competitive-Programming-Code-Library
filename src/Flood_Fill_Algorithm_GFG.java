import java.io.*;
import java.util.*;

public class Flood_Fill_Algorithm_GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {


        }
        pw.close();
    }

    public  static int[][] floodFill(int [][] image,int sr,int sc,int newColor){
        int initial_color = image[sr][sc];

        int ans[][] = image;

        int delRow[] = {-1,0,+1,0};
        int delCol[] = {0,+1,0,-1};

        dfs(sr,sc,ans,image,newColor,delRow,delCol,initial_color);
        return ans;
    }

    static void dfs(int row,int col,int ans[][],int[][]image,int newColor,int delRow[],int delCol[],
                    int initial_color){
        ans[row][col] = newColor;

        int n = image.length;
        int m = image[0].length;

        for(int i = 0;i<4;i++){
            int new_row = row+delRow[i];
            int new_col = col+delCol[i];

            if(new_row>=0 && new_row<n && new_col>=0 && new_col<m && image[new_row][new_col]==initial_color
            && ans[new_row][new_col] != newColor){
                dfs(new_row,new_col,ans,image,newColor,delRow,delCol,initial_color);
            }
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
