import java.io.*;
import java.util.*;

public class Div2_215_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(),d = in.nextInt();
        int a[] = new int[n];

        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int m = in.nextInt();

        pw.println(solve(a,n,d,m));

        pw.close();
    }

    static int solve(int a[],int n ,int d,int m){
        int sum = 0;

        for(int i = 0;i<Math.min(n,m);i++){
            sum+=a[i];
        }

        if(m>n){
            int sub = m-n;
            sub*=d;

            sum=sum-sub;
        }

        return sum;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
