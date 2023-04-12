import java.io.*;
import java.util.*;

public class Edu_141_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[][] = new int[n][n];

            int left = 1, right = n*n;
            boolean flag = true;

            int value=0;
            for(int i = 0;i<n;i++){
                if(flag){
                    for(int j=0;j<n;j++){
                      if(value==0){
                          a[i][j] = left;
                          left++;
                          value = 1;
                      }
                      else{
                          value=0;
                          a[i][j] = right;
                          right--;
                      }
                    }
                    flag = false;
                }
                else {
                    for(int j=n-1;j>=0;j--){
                        if(value==0){
                            a[i][j] = left;
                            left++;
                            value = 1;
                        }
                        else{
                            value=0;
                            a[i][j] = right;
                            right--;
                        }
                    }
                    flag = true;
                }
            }

            for(int i = 0;i<n;i++){
                for (int j = 0;j<n;j++){
                    pw.print(a[i][j]+" ");
                }
                pw.println();
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
