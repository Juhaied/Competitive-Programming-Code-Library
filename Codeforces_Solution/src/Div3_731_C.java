import java.io.*;
import java.util.*;

public class Div3_731_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int k = in.nextInt(), n = in.nextInt(), m = in.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];

            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            for (int i = 0;i<m;i++){
                b[i] = in.nextInt();
            }

            int i = 0, j = 0;

            ArrayList<Integer> list = new ArrayList<>();
            boolean flag  = true;
            while (i<n || j<m){
                if(i<n && j<m){
                    if(a[i]==0){
                        list.add(0);
                        i++;
                        k++;
                    }
                    else if (b[j]==0) {
                        list.add(0);
                        j++;
                        k++;
                    }
                    else {
                        if(a[i]<b[j] && a[i]<=k){
                            list.add(a[i]);
                            i++;
                        }
                        else if(a[i]>=b[j] && b[j]<=k){
                            list.add(b[j]);
                            j++;
                        }
                        else {
                            flag = false;
                            break;
                        }
                    }
                }
                else if(i<n){
                    if(a[i]==0){
                        list.add(0);
                        i++;
                        k++;
                    }
                    else {
                        if(a[i]<=k){
                            list.add(a[i]);
                            i++;
                        }
                        else {
                            flag = false;
                            break;
                        }
                    }
                }
                else if (j<m) {
                    if(b[j]==0){
                        list.add(0);
                        j++;
                        k++;
                    }
                    else {
                        if(b[j]<=k){
                            list.add(b[j]);
                            j++;
                        }
                        else {
                            flag = false;
                            break;
                        }
                    }
                }
            }

            if(flag){
                for(int ara:list){
                    pw.print(ara+" ");
                }
                pw.println();
            }
            else {
                pw.println(-1);
            }
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
