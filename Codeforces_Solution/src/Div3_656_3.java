import java.io.*;
import java.util.*;

public class Div3_656_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];

            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            if(isSorted(a)){
                pw.println(0);
            }
            else {
                int ind  = 0;
                int cnt = 0;
                for(int i = 0;i<n-1;i++){
                    if(a[i]<a[i+1]){
                        cnt++;
                        ind = i+1;
                    }
                    else {
                        cnt=0;
                    }
                }


                int ase = 0;
                for(int i = ind;i>=1;i--){
                    if(a[i]>=a[i-1]){
                        ase++;
                    }
                    else {
                        break;
                    }
                }
                ase++;
                ind++;
                ase+=(n-ind);

                pw.println(n-ase);

            }
        }
        pw.close();
    }
    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                return false;
        return true;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
