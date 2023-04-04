import java.io.*;
import java.util.*;

public class Div3_863_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int test  = in.nextInt();


        for(int t = 1;t<=test;t++){

            int n = in.nextInt();

            int m = n-1;
            int a[] = new int[n];

            for(int i = 0;i<m;i++){
                a[i] = in.nextInt();
            }
            int ind  = 0,add = 0;
            for(int i =0;i<m-1;i++){
                int max = Math.max(a[i],a[i+1]);

                if(max==a[i]){
                    ind++;
                }
                else{
                    ind++;
                    add = a[i];
                    break;
                }
            }

            //  debug(ind+" "+add);

            boolean flag = true;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0;i<m;i++){
                if(i==ind && flag){
                    list.add(add);
                    flag=false;
                    i--;
                }
                else {
                    list.add(a[i]);
                }
            }

            int b[] = new int[n];
            for(int i = 0;i<n;i++){
                b[i] = list.get(i);
            }



            for(int i = n-1;i>=1;i--){
                if(b[i-1]>b[i]){
                    b[i-1] =b[i];
                    break;
                }
            }

            //  debug(b);

            for(int i = 0;i<n-1;i++){
                if(Math.max(b[i],b[i+1]) != a[i]){
                    b[i] = a[i];
                }
            }
            for(int i :b){
                pw.print(i+" ");
            }
            pw.println();
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}