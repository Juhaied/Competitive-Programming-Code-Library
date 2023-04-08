import java.io.*;
import java.util.*;

public class Div2_864_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            int x1 = in.nextInt(),y1 = in.nextInt();
            int x2 = in.nextInt(),y2 = in.nextInt();

            int x11 = x1-1,y11 = y1;
            int x12 = x1+1,y12 = y1;
            int x13 = x1,y13 = y1+1;
            int x14 = x1,y14 = y1-1;
            int ans = 4;

            if(x11==0){
                ans--;
            }
             if(x12>x){
                 ans--;
             }
             if(y13>y){
                 ans--;
             }
             if(y14==0){
                 ans--;
             }

            int x111 = x2-1,y111 = y2;
            int x122 = x2+1,y122 = y2;
            int x133 = x2,y133 = y2+1;
            int x144 = x2,y144 = y2-1;
            int ans1 = 4;

            if(x111==0){
                ans1--;
            }
            if(x122>x){
                ans1--;
            }
            if(y133>y){
                ans1--;
            }
            if(y144==0){
                ans1--;
            }

             pw.println(Math.min(ans,ans1));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
