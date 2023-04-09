import java.io.*;
import java.util.*;

public class Div2_635_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(),n = in.nextInt(), m = in.nextInt();
            int move1 = 0,move2 = 0;
            for (int i = 1;i<=n+m;i++){
                int xx = (x/2)+10;

                if(xx<x && move1 != n){
                    x =xx;
                    move1++;
                }
                else{
                    if(move2!=m){
                        x-=10;
                        move2++;
                    }
                }
            }

           if(x<=0){
               pw.println("YES");
           }
           else {
               pw.println("NO");
           }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
