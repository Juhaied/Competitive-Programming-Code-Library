import java.io.*;
import java.util.*;

public class Div1_683_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        runner:for (int tt = 0; tt < t; tt++) {
            int n=in.nextInt();
            int a[]=new int[n];
            long W=in.nextLong();
            long w=(W+1)/2;
            for(int i=0;i<n;i++) a[i]=in.nextInt();
            StringBuilder sb=new StringBuilder();
            long sum=0,c=0;
            for(int i=0;i<n;i++) {
                if(a[i]>=w && a[i]<=W)
                {
                    System.out.println("1\n"+(i+1));
                    continue runner;

                }
                else if(a[i]<=W)
                {
                    sum+=a[i];
                    c++;
                    sb.append((i+1)+" ");

                }
                if(sum>=w)
                {
                    System.out.println(c+"\n"+sb);
                    continue  runner;
                }
            }
           System.out.println(-1);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
