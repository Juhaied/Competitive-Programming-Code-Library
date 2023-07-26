import java.io.PrintWriter;
import java.util.*;

public class DIv4_886_B {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int test = in.nextInt();

        for (int t = 1; t<=test; t++){
            int n = in.nextInt();

            int a[] = new int[n];
            int b[] = new int[n];
            int ans = 0;
            for (int i = 0;i<n;i++){
                int v1 = in.nextInt(), v2 = in.nextInt();

                a[i] = v1;
                b[i] = v2;
            }
            int ind = 0;
            for (int i = 0;i<n;i++){
                if(a[i]<=10){
                    if(b[i]>=ans){
                        ans = b[i];
                        ind= i+1;
                    }
                }
            }

            pw.println(ind);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
