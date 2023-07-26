import java.io.PrintWriter;
import java.util.*;

public class Div4_886_D {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int test = in.nextInt();

        for (int t = 1; t<=test; t++){
            int n = in.nextInt(), k = in.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0;i<n;i++){
                list.add(in.nextInt());
            }

            Collections.sort(list);

            int a[] = new int[n];
            for (int i = 0;i<n;i++){
                a[i] = list.get(i);
            }



            int ans  = Integer.MIN_VALUE;
            int cnt  = 0;

            for (int i = 0;i<n-1;i++){
                if(a[i+1]-a[i]<=k){
                    cnt++;
                }
                else {
                    ans = Math.max(ans,cnt);
                    cnt = 0;
                }
            }

            ans = Math.max(ans,cnt);

            ans++;
            pw.println(n-ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
