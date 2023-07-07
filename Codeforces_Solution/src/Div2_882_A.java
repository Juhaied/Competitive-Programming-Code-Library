import java.io.*;
import java.util.*;

public class Div2_882_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(),k = in.nextInt();

            int a[] = new int[n];

            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }
            pw.println(solve(a,n,k));
            //debug(sum);
        }
        pw.close();
    }

    static int solve(int a[],int n,int k){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1;i<n;i++){
            list.add(Math.abs(a[i]-a[i-1]));
        }

        Collections.sort(list);

        int sum = 0;
        for (int i = 0;i<n-k;i++){
            sum+=list.get(i);
        }

        return sum;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
