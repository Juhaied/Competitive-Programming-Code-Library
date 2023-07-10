import java.io.*;
import java.util.*;

public class Div2_602_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            TreeSet<Integer> list =new TreeSet<>();

            for (int i = 0;i<n;i++){
                list.add(i+1);
            }
            int ans[] = new int[n+1];
            boolean f = true;
            for (int i = 1;i<=n;i++){
                Integer x = in.nextInt();

                if(list.contains(x)){
                    list.remove(x);
                    ans[i] = x;
                }
                else {
                    Integer next = list.first();

                    if(next<x){
                        list.remove(next);
                        ans[i] = next;
                    }
                    else {
                        f = false;
                    }

                    if(!f){
                        break;
                    }
                }
            }

            if(f){
                for (int i = 1;i<=n;i++){
                    pw.print(ans[i]+" ");
                }
            }
            else {
                pw.print(-1);
            }
            pw.println();
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
