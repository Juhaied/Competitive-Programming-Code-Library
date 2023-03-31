import java.io.*;
import java.util.*;

public class Lightoj_1133 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(),query = in.nextInt();
            int a[] = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }
            for(int i = 0;i<query;i++){
                char ch = in.next().charAt(0);

                if(ch=='S'){
                    int d = in.nextInt();

                    for(int j = 0;j<n;j++){
                        a[j]+=d;
                    }
                }
                else if(ch=='M'){
                    int d = in.nextInt();

                    for(int j = 0;j<n;j++){
                        a[j]*=d;
                    }
                }
                else if(ch=='D'){
                    int d = in.nextInt();

                    for(int j = 0;j<n;j++){
                        a[j]/=d;
                    }
                }
                else if(ch=='P'){
                    int d = in.nextInt(),k = in.nextInt();
                    int tmp = a[d];
                    a[d] = a[k];
                    a[k] =tmp;
                }
                else{
                    int copy[]  = new int[n];
                    int kk = n-1;
                    for(int j = 0;j<n;j++){
                        copy[j] = a[kk];
                        kk--;
                    }

                    for(int j = 0;j<n;j++){
                        a[j] = copy[j];
                    }
                }
            }
            pw.println("Case "+(tt+1)+":");
            for(int i = 0;i<n;i++){
                if(i==n-1){
                    pw.print(a[i]);
                }
                else {
                    pw.print(a[i] + " ");
                }
            }
            pw.println();
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
