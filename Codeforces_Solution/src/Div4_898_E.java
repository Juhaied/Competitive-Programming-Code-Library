import java.io.*;
import java.util.*;

public class Div4_898_E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), x = in.nextInt();
            int a[] = new int[n];

            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            pw.println(binary_search(x,a));
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    public  static long binary_search(int x,int a[]){
       // debug(x);
        long left = 1,right =10000000000L;
        long ans = 0;
        while (left<=right){
            long mid = (left+right)/2;

            if(isPossible(a,x,mid)){
                ans= mid;
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }

        return ans;
    }

    public static boolean isPossible(int a[],long x,long value){
        //debug("Value "+value);
        long sum = 0;
        for (int i = 0;i<a.length;i++){
            if(a[i]<=value){
                sum+=(value-a[i]);
            }
          //  debug("Lop "+sum);
        }
     //   debug("HERE : "+sum+" "+value);

        if(sum<=x){
            return true;
        }
        else {
            return false;
        }
    }
}
