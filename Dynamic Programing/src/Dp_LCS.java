import java.io.*;
import java.util.*;

public class Dp_LCS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        char c1[] = (" "+in.next()).toCharArray();
        char c2[] = (" "+in.next()).toCharArray();

        String ans = "";
        int dp[][] =new int[c1.length][c2.length];

        for(int i = 1;i<c1.length;i++){
            for (int j = 1;j<c2.length;j++){
                if(c1[i]==c2[j]){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        int i = c1.length-1,j = c2.length-1;

        while (i>0 && j>0){
            if(c1[i]==c2[j]){
                ans = c1[i]+ans;
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }
            else {
                j--;
            }
        }

        pw.print(ans);


        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
