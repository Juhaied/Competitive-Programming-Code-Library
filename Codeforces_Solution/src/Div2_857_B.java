import java.io.*;
import java.util.*;

public class Div2_857_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];

            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            int ans  = 0,animal = 0,filled = 0;

            for(int i = 0;i<n;i++){
                if(a[i]==1){
                    animal++;
                    filled++;
                }
                else {
                    if(animal==0){
                        filled=0;
                    }
                    else {
                        filled = (animal/2)+1;
                    }
                }

                ans = Math.max(ans,filled);
            }

            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
